package typingsSlinky.allureJsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("allure-js-commons", JSImport.Namespace)
  @js.native
  class ^ () extends Allure
  
  @JSImport("allure-js-commons", "Attachment")
  @js.native
  class Attachment protected () extends StObject {
    def this(title: String, source: js.Any, size: Double, mime: String) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Description")
  @js.native
  class Description protected () extends StObject {
    def this(value: String, `type`: TYPE) = this()
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Step")
  @js.native
  class Step protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Suite")
  @js.native
  class Suite protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addTest(test: Test): Boolean = js.native
    
    def end(): Unit = js.native
    def end(timestamp: Double): Unit = js.native
    
    def hasTests(): Boolean = js.native
    
    var name: String = js.native
    
    def toXML(): String = js.native
  }
  
  @js.native
  sealed trait TYPE extends StObject
  @JSImport("allure-js-commons", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TYPE with String] = js.native
    
    @js.native
    sealed trait HTML extends TYPE
    /* "html" */ val HTML: typingsSlinky.allureJsCommons.mod.TYPE.HTML with String = js.native
    
    @js.native
    sealed trait MARKDOWN extends TYPE
    /* "markdown" */ val MARKDOWN: typingsSlinky.allureJsCommons.mod.TYPE.MARKDOWN with String = js.native
    
    @js.native
    sealed trait TEXT extends TYPE
    /* "text" */ val TEXT: typingsSlinky.allureJsCommons.mod.TYPE.TEXT with String = js.native
  }
  
  @JSImport("allure-js-commons", "Test")
  @js.native
  class Test protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addLabel(name: String, value: String): Unit = js.native
    
    def addParameter(kind: js.Any, name: String, value: String): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def setDescription(description: String, `type`: TYPE): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @js.native
  trait Allure extends StObject {
    
    def addAttachment(attachmentName: String, buffer: js.Any, `type`: String): Unit = js.native
    
    def endCase(status: Status): Unit = js.native
    def endCase(status: Status, err: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def endCase(status: Status, err: js.Object): Unit = js.native
    def endCase(status: Status, err: js.Object, timestamp: Double): Unit = js.native
    
    def endStep(status: Status): Unit = js.native
    def endStep(status: Status, timestamp: Double): Unit = js.native
    
    def endSuite(): Unit = js.native
    def endSuite(timestamp: Double): Unit = js.native
    
    def getCurrentSuite(): Suite = js.native
    
    def getCurrentTest(): Test = js.native
    
    def pendingCase(testName: String): Unit = js.native
    def pendingCase(testName: String, timestamp: Double): Unit = js.native
    
    def setDescription(description: String): Unit = js.native
    def setDescription(description: String, timestamp: Double): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    def startCase(testName: String): Unit = js.native
    def startCase(testName: String, timestamp: Double): Unit = js.native
    
    def startStep(stepName: String): Unit = js.native
    def startStep(stepName: String, timestamp: Double): Unit = js.native
    
    def startSuite(suiteName: String): Unit = js.native
    def startSuite(suiteName: String, timestamp: Double): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var targetDir: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(targetDir: String): Options = {
      val __obj = js.Dynamic.literal(targetDir = targetDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetDir(value: String): Self = StObject.set(x, "targetDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.allureJsCommons.allureJsCommonsStrings.passed
    - typingsSlinky.allureJsCommons.allureJsCommonsStrings.pending
    - typingsSlinky.allureJsCommons.allureJsCommonsStrings.skipped
    - typingsSlinky.allureJsCommons.allureJsCommonsStrings.failed
    - typingsSlinky.allureJsCommons.allureJsCommonsStrings.broken
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def broken: typingsSlinky.allureJsCommons.allureJsCommonsStrings.broken = "broken".asInstanceOf[typingsSlinky.allureJsCommons.allureJsCommonsStrings.broken]
    
    @scala.inline
    def failed: typingsSlinky.allureJsCommons.allureJsCommonsStrings.failed = "failed".asInstanceOf[typingsSlinky.allureJsCommons.allureJsCommonsStrings.failed]
    
    @scala.inline
    def passed: typingsSlinky.allureJsCommons.allureJsCommonsStrings.passed = "passed".asInstanceOf[typingsSlinky.allureJsCommons.allureJsCommonsStrings.passed]
    
    @scala.inline
    def pending: typingsSlinky.allureJsCommons.allureJsCommonsStrings.pending = "pending".asInstanceOf[typingsSlinky.allureJsCommons.allureJsCommonsStrings.pending]
    
    @scala.inline
    def skipped: typingsSlinky.allureJsCommons.allureJsCommonsStrings.skipped = "skipped".asInstanceOf[typingsSlinky.allureJsCommons.allureJsCommonsStrings.skipped]
  }
}
