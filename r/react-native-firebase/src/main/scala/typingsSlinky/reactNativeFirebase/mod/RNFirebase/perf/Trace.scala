package typingsSlinky.reactNativeFirebase.mod.RNFirebase.perf

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trace extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null] = js.native
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object] = js.native
  /**
    * Get a metric by name. Returns 0 if it does not exist.
    */
  def getMetric(metricName: String): js.Promise[Double] = js.native
  /**
    * Increment a metric by name and value.
    */
  def incrementMetric(metricName: String, incrementBy: Double): js.Promise[Null] = js.native
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`] = js.native
  /**
    * Set a metric.
    */
  def putMetric(metricName: String, value: Double): js.Promise[Null] = js.native
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null] = js.native
  /**
    * Start a Trace instance.
    */
  def start(): js.Promise[Null] = js.native
  /**
    * Stop a Trace instance.
    */
  def stop(): js.Promise[Null] = js.native
}

object Trace {
  @scala.inline
  def apply(
    getAttribute: String => js.Promise[String | Null],
    getAttributes: () => js.Promise[js.Object],
    getMetric: String => js.Promise[Double],
    incrementMetric: (String, Double) => js.Promise[Null],
    putAttribute: (String, String) => js.Promise[`true` | `false`],
    putMetric: (String, Double) => js.Promise[Null],
    removeAttribute: String => js.Promise[Null],
    start: () => js.Promise[Null],
    stop: () => js.Promise[Null]
  ): Trace = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), getMetric = js.Any.fromFunction1(getMetric), incrementMetric = js.Any.fromFunction2(incrementMetric), putAttribute = js.Any.fromFunction2(putAttribute), putMetric = js.Any.fromFunction2(putMetric), removeAttribute = js.Any.fromFunction1(removeAttribute), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Trace]
  }
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribute(value: String => js.Promise[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => js.Promise[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetric(value: String => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementMetric(value: (String, Double) => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementMetric")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutMetric(value: (String, Double) => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putMetric")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: String => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

