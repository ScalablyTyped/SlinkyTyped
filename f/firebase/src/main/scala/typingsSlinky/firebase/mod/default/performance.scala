package typingsSlinky.firebase.mod.default

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.anon.Attributes
import typingsSlinky.firebase.mod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object performance {
  
  /**
    * Gets the {@link firebase.performance.Performance `Performance`} service.
    *
    * `firebase.performance()` can be called with no arguments to access the default
    * app's {@link firebase.performance.Performance `Performance`} service.
    * The {@link firebase.performance.Performance `Performance`} service does not work with
    * any other app.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Performance service for the default app
    * const defaultPerformance = firebase.performance();
    * ```
    *
    * @param app The app to create a performance service for. Performance Monitoring only works with
    * the default app.
    * If not passed, uses the default app.
    */
  @JSImport("firebase", "default.performance")
  @js.native
  def apply(): typingsSlinky.firebase.mod.firebase.performance.Performance = js.native
  @JSImport("firebase", "default.performance")
  @js.native
  def apply(app: App): typingsSlinky.firebase.mod.firebase.performance.Performance = js.native
  
  @js.native
  trait Performance extends StObject {
    
    /**
      * Controls the logging of custom traces.
      */
    var dataCollectionEnabled: Boolean = js.native
    
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    var instrumentationEnabled: Boolean = js.native
    
    /**
      * Creates an uninitialized instance of {@link firebase.performance.Trace `trace`} and returns
      * it.
      *
      * @param traceName The name of the trace instance.
      * @return The Trace instance.
      */
    def trace(traceName: String): typingsSlinky.firebase.mod.firebase.performance.Trace = js.native
  }
  object Performance {
    
    @scala.inline
    def apply(
      dataCollectionEnabled: Boolean,
      instrumentationEnabled: Boolean,
      trace: String => typingsSlinky.firebase.mod.firebase.performance.Trace
    ): Performance = {
      val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace))
      __obj.asInstanceOf[Performance]
    }
    
    @scala.inline
    implicit class PerformanceMutableBuilder[Self <: Performance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "dataCollectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumentationEnabled(value: Boolean): Self = StObject.set(x, "instrumentationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrace(value: String => typingsSlinky.firebase.mod.firebase.performance.Trace): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Trace extends StObject {
    
    /**
      * Retrieves the value that the custom attribute is set to.
      *
      * @param attr Name of the custom attribute.
      */
    def getAttribute(attr: String): js.UndefOr[String] = js.native
    
    /**
      * Returns a map of all custom attributes of a {@link firebase.performance.Trace `trace`}
      * instance.
      */
    def getAttributes(): StringDictionary[String] = js.native
    
    /**
      * Returns the value of the custom metric by that name. If a custom metric with that name does
      * not exist returns zero.
      *
      * @param metricName Name of the custom metric.
      */
    def getMetric(metricName: String): Double = js.native
    
    /**
      * Adds to the value of a custom metric. If a custom metric with the provided name does not
      * exist, it creates one with that name and the value equal to the given number.
      *
      * @param metricName The name of the custom metric.
      * @param num The number to be added to the value of the custom metric. If not provided, it
      * uses a default value of one.
      */
    def incrementMetric(metricName: String): Unit = js.native
    def incrementMetric(metricName: String, num: Double): Unit = js.native
    
    /**
      * Set a custom attribute of a {@link firebase.performance.Trace `trace`} to a certain value.
      *
      * @param attr Name of the custom attribute.
      * @param value Value of the custom attribute.
      */
    def putAttribute(attr: String, value: String): Unit = js.native
    
    /**
      * Sets the value of the specified custom metric to the given number regardless of whether
      * a metric with that name already exists on the {@link firebase.performance.Trace `trace`}
      * instance or not.
      *
      * @param metricName Name of the custom metric.
      * @param num Value to of the custom metric.
      */
    def putMetric(metricName: String, num: Double): Unit = js.native
    
    /**
      * Records a {@link firebase.performance.Trace `trace`} from given parameters. This provides a
      * direct way to use {@link firebase.performance.Trace `trace`} without a need to start/stop.
      * This is useful for use cases in which the {@link firebase.performance.Trace `trace`} cannot
      * directly be used (e.g. if the duration was captured before the Performance SDK was loaded).
      *
      * @param startTime Trace start time since epoch in millisec.
      * @param duration The duraction of the trace in millisec.
      * @param options An object which can optionally hold maps of custom metrics and
      * custom attributes.
      */
    def record(startTime: Double, duration: Double): Unit = js.native
    def record(startTime: Double, duration: Double, options: Attributes): Unit = js.native
    
    /**
      * Removes the specified custom attribute from a {@link firebase.performance.Trace `trace`}
      * instance.
      *
      * @param attr Name of the custom attribute.
      */
    def removeAttribute(attr: String): Unit = js.native
    
    /**
      * Starts the timing for the {@link firebase.performance.Trace `trace`} instance.
      */
    def start(): Unit = js.native
    
    /**
      * Stops the timing of the {@link firebase.performance.Trace `trace`} instance and logs the
      * data of the instance.
      */
    def stop(): Unit = js.native
  }
}
