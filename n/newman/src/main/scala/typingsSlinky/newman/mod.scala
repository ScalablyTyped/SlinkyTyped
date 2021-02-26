package typingsSlinky.newman

import typingsSlinky.newman.anon.Assertions
import typingsSlinky.newman.anon.Http
import typingsSlinky.newman.anon.Ref
import typingsSlinky.newman.newmanStrings.auto
import typingsSlinky.newman.newmanStrings.failure
import typingsSlinky.newman.newmanStrings.folder
import typingsSlinky.newman.newmanStrings.off
import typingsSlinky.newman.newmanStrings.on
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.postmanCollection.mod.Collection
import typingsSlinky.postmanCollection.mod.CollectionDefinition
import typingsSlinky.postmanCollection.mod.VariableScope
import typingsSlinky.postmanCollection.mod.VariableScopeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("newman", "run")
  @js.native
  def run(callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]): EventEmitter = js.native
  @JSImport("newman", "run")
  @js.native
  def run(options: NewmanRunOptions): EventEmitter = js.native
  @JSImport("newman", "run")
  @js.native
  def run(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]
  ): EventEmitter = js.native
  
  @js.native
  trait NewmanRun extends StObject {
    
    var executions: js.Array[NewmanRunExecution] = js.native
    
    var failures: js.Array[NewmanRunFailure] = js.native
    
    var stats: Assertions = js.native
  }
  object NewmanRun {
    
    @scala.inline
    def apply(executions: js.Array[NewmanRunExecution], failures: js.Array[NewmanRunFailure], stats: Assertions): NewmanRun = {
      val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRun]
    }
    
    @scala.inline
    implicit class NewmanRunMutableBuilder[Self <: NewmanRun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutions(value: js.Array[NewmanRunExecution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionsVarargs(value: NewmanRunExecution*): Self = StObject.set(x, "executions", js.Array(value :_*))
      
      @scala.inline
      def setFailures(value: js.Array[NewmanRunFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresVarargs(value: NewmanRunFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      @scala.inline
      def setStats(value: Assertions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewmanRunExecution extends StObject {
    
    var assertions: js.Array[NewmanRunExecutionAssertion] = js.native
    
    var item: NewmanRunExecutionItem = js.native
  }
  object NewmanRunExecution {
    
    @scala.inline
    def apply(assertions: js.Array[NewmanRunExecutionAssertion], item: NewmanRunExecutionItem): NewmanRunExecution = {
      val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecution]
    }
    
    @scala.inline
    implicit class NewmanRunExecutionMutableBuilder[Self <: NewmanRunExecution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertions(value: js.Array[NewmanRunExecutionAssertion]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssertionsVarargs(value: NewmanRunExecutionAssertion*): Self = StObject.set(x, "assertions", js.Array(value :_*))
      
      @scala.inline
      def setItem(value: NewmanRunExecutionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewmanRunExecutionAssertion extends StObject {
    
    var assertion: String = js.native
    
    var error: NewmanRunExecutionAssertionError = js.native
  }
  object NewmanRunExecutionAssertion {
    
    @scala.inline
    def apply(assertion: String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
      val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionAssertion]
    }
    
    @scala.inline
    implicit class NewmanRunExecutionAssertionMutableBuilder[Self <: NewmanRunExecutionAssertion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertion(value: String): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: NewmanRunExecutionAssertionError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewmanRunExecutionAssertionError extends StObject {
    
    var index: Double = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var stack: String = js.native
    
    var test: String = js.native
  }
  object NewmanRunExecutionAssertionError {
    
    @scala.inline
    def apply(index: Double, message: String, name: String, stack: String, test: String): NewmanRunExecutionAssertionError = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionAssertionError]
    }
    
    @scala.inline
    implicit class NewmanRunExecutionAssertionErrorMutableBuilder[Self <: NewmanRunExecutionAssertionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewmanRunExecutionItem extends StObject {
    
    var name: String = js.native
  }
  object NewmanRunExecutionItem {
    
    @scala.inline
    def apply(name: String): NewmanRunExecutionItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunExecutionItem]
    }
    
    @scala.inline
    implicit class NewmanRunExecutionItemMutableBuilder[Self <: NewmanRunExecutionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewmanRunFailure extends StObject {
    
    /** The event where the failure occurred */
    var at: String = js.native
    
    var cursor: Ref | js.Object = js.native
    
    var error: NewmanRunExecutionAssertionError = js.native
    
    var parent: js.Any = js.native
    
    var source: js.UndefOr[NewmanRunExecutionItem] = js.native
  }
  object NewmanRunFailure {
    
    @scala.inline
    def apply(at: String, cursor: Ref | js.Object, error: NewmanRunExecutionAssertionError, parent: js.Any): NewmanRunFailure = {
      val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunFailure]
    }
    
    @scala.inline
    implicit class NewmanRunFailureMutableBuilder[Self <: NewmanRunFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor(value: Ref | js.Object): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: NewmanRunExecutionAssertionError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: NewmanRunExecutionItem): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait NewmanRunOptions extends StObject {
    
    /**
      * Specify whether or not to stop a collection run on encountering the
      * first test script error.
      *
      * "folder" allows you to skip the entire collection run in case an invalid
      * folder was specified using the `folder` option or an error was
      * encountered in general.
      *
      * "failure" would gracefully stop a collection run after completing the
      * current test script.
      *
      * Default value: false
      */
    var bail: js.UndefOr[Boolean | (js.Array[folder | failure])] = js.native
    
    /** A JSON / Collection / String representing the collection. */
    var collection: Collection | CollectionDefinition | String = js.native
    
    /**
      * Enable or Disable colored CLI output.
      *
      * Default value: auto
      */
    var color: js.UndefOr[on | off | auto] = js.native
    
    /**
      * Specify the time (in milliseconds) to wait for between subsequent
      * requests.
      *
      * Default value: 0
      */
    var delayRequest: js.UndefOr[Double] = js.native
    
    /** An environment JSON / file path for the current collection run. */
    var environment: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
    
    /** The relative path to export the collection from the current run to */
    var exportCollection: js.UndefOr[String] = js.native
    
    /** The relative path to export the environment file from the current run to */
    var exportEnvironment: js.UndefOr[String] = js.native
    
    /** The relative path to export the globals file from the current run to  */
    var exportGlobals: js.UndefOr[String] = js.native
    
    /**
      * The name or ID of the folder (ItemGroup) in the collection which would
      * be run instead of the entire collection.
      */
    var folder: js.UndefOr[String | js.Array[String]] = js.native
    
    /** A globals JSON / file path for the current collection run. */
    var globals: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
    
    /**
      * This specifies whether newman would automatically follow 3xx responses
      * from servers.
      *
      * Default value: false
      */
    var ignoreRedirects: js.UndefOr[Boolean] = js.native
    
    /**
      * Disables SSL verification checks and allows self-signed SSL certificates.
      *
      * Default value: false
      */
    var insecure: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow reading files outside of working directory.
      */
    var insecureFileRead: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the number of iterations to run on the collection. This is
      * usually accompanied by providing a data file reference as
      * iterationData
      */
    var iterationCount: js.UndefOr[Double] = js.native
    
    /**
      * Path to the JSON or CSV file or URL to be used as data source when
      * running multiple iterations on a collection.
      */
    var iterationData: js.UndefOr[js.Any] = js.native
    
    /**
      * Specify options for the reporter(s) declared in options.reporters.
      */
    var reporter: js.UndefOr[js.Any] = js.native
    
    /** Available reporters: cli, json, html and junit. */
    var reporters: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Custom HTTP(S) agents which will be used for making the requests. This allows for use of various proxies (e.g. socks)
      */
    var requestAgents: js.UndefOr[Http] = js.native
    
    /**
      * The path to the public client certificate file.
      */
    var sslClientCert: js.UndefOr[String] = js.native
    
    /**
      * The path to the private client key file.
      */
    var sslClientKey: js.UndefOr[String] = js.native
    
    /**
      * The secret client key passphrase.
      */
    var sslClientPassphrase: js.UndefOr[String] = js.native
    
    /**
      * If present, allows overriding the default exit code from the current
      * collection run, useful for bypassing collection result failures.
      *
      * Default value: false
      */
    var suppressExitCode: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the time (in milliseconds) to wait for the entire collection run
      * to complete execution.
      *
      * Default value: Infinity
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Specify the time (in milliseconds) to wait for requests to return a
      * response.
      *
      * Default value: Infinity
      */
    var timeoutRequest: js.UndefOr[Double] = js.native
    
    /**
      * Specify the time (in milliseconds) to wait for scripts to return a
      * response.
      *
      * Default value: Infinity
      */
    var timeoutScript: js.UndefOr[Double] = js.native
    
    /**
      * The path of the directory to be used as working directory.
      */
    var workingDir: js.UndefOr[String] = js.native
  }
  object NewmanRunOptions {
    
    @scala.inline
    def apply(collection: Collection | CollectionDefinition | String): NewmanRunOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunOptions]
    }
    
    @scala.inline
    implicit class NewmanRunOptionsMutableBuilder[Self <: NewmanRunOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBail(value: Boolean | (js.Array[folder | failure])): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      @scala.inline
      def setBailVarargs(value: (folder | failure)*): Self = StObject.set(x, "bail", js.Array(value :_*))
      
      @scala.inline
      def setCollection(value: Collection | CollectionDefinition | String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: on | off | auto): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDelayRequest(value: Double): Self = StObject.set(x, "delayRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayRequestUndefined: Self = StObject.set(x, "delayRequest", js.undefined)
      
      @scala.inline
      def setEnvironment(value: VariableScope | VariableScopeDefinition | String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setExportCollection(value: String): Self = StObject.set(x, "exportCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportCollectionUndefined: Self = StObject.set(x, "exportCollection", js.undefined)
      
      @scala.inline
      def setExportEnvironment(value: String): Self = StObject.set(x, "exportEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportEnvironmentUndefined: Self = StObject.set(x, "exportEnvironment", js.undefined)
      
      @scala.inline
      def setExportGlobals(value: String): Self = StObject.set(x, "exportGlobals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportGlobalsUndefined: Self = StObject.set(x, "exportGlobals", js.undefined)
      
      @scala.inline
      def setFolder(value: String | js.Array[String]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setFolderVarargs(value: String*): Self = StObject.set(x, "folder", js.Array(value :_*))
      
      @scala.inline
      def setGlobals(value: VariableScope | VariableScopeDefinition | String): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setIgnoreRedirects(value: Boolean): Self = StObject.set(x, "ignoreRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRedirectsUndefined: Self = StObject.set(x, "ignoreRedirects", js.undefined)
      
      @scala.inline
      def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureFileRead(value: Boolean): Self = StObject.set(x, "insecureFileRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureFileReadUndefined: Self = StObject.set(x, "insecureFileRead", js.undefined)
      
      @scala.inline
      def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      @scala.inline
      def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      @scala.inline
      def setIterationData(value: js.Any): Self = StObject.set(x, "iterationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationDataUndefined: Self = StObject.set(x, "iterationData", js.undefined)
      
      @scala.inline
      def setReporter(value: js.Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setReporters(value: String | js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      @scala.inline
      def setRequestAgents(value: Http): Self = StObject.set(x, "requestAgents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAgentsUndefined: Self = StObject.set(x, "requestAgents", js.undefined)
      
      @scala.inline
      def setSslClientCert(value: String): Self = StObject.set(x, "sslClientCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslClientCertUndefined: Self = StObject.set(x, "sslClientCert", js.undefined)
      
      @scala.inline
      def setSslClientKey(value: String): Self = StObject.set(x, "sslClientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslClientKeyUndefined: Self = StObject.set(x, "sslClientKey", js.undefined)
      
      @scala.inline
      def setSslClientPassphrase(value: String): Self = StObject.set(x, "sslClientPassphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslClientPassphraseUndefined: Self = StObject.set(x, "sslClientPassphrase", js.undefined)
      
      @scala.inline
      def setSuppressExitCode(value: Boolean): Self = StObject.set(x, "suppressExitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressExitCodeUndefined: Self = StObject.set(x, "suppressExitCode", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutRequest(value: Double): Self = StObject.set(x, "timeoutRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutRequestUndefined: Self = StObject.set(x, "timeoutRequest", js.undefined)
      
      @scala.inline
      def setTimeoutScript(value: Double): Self = StObject.set(x, "timeoutScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutScriptUndefined: Self = StObject.set(x, "timeoutScript", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
    }
  }
  
  @js.native
  trait NewmanRunStat extends StObject {
    
    var failed: js.UndefOr[Double] = js.native
    
    var pending: js.UndefOr[Double] = js.native
    
    var total: js.UndefOr[Double] = js.native
  }
  object NewmanRunStat {
    
    @scala.inline
    def apply(): NewmanRunStat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewmanRunStat]
    }
    
    @scala.inline
    implicit class NewmanRunStatMutableBuilder[Self <: NewmanRunStat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      @scala.inline
      def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  @js.native
  trait NewmanRunSummary extends StObject {
    
    var collection: js.Any = js.native
    
    var environment: js.Any = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var globals: js.Any = js.native
    
    var run: NewmanRun = js.native
  }
  object NewmanRunSummary {
    
    @scala.inline
    def apply(collection: js.Any, environment: js.Any, globals: js.Any, run: NewmanRun): NewmanRunSummary = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewmanRunSummary]
    }
    
    @scala.inline
    implicit class NewmanRunSummaryMutableBuilder[Self <: NewmanRunSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: js.Any): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: js.Any): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setGlobals(value: js.Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: NewmanRun): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
}
