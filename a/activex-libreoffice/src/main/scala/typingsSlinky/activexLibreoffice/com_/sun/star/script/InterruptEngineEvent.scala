package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an interrupt which occurs in the scripting engine.
  * @deprecated Deprecated
  */
@js.native
trait InterruptEngineEvent extends EventObject {
  /** contains the first column in the "EndLine" which is NOT affected by the event that took place. */
  var EndColumn: Double = js.native
  /** contains the last line in the module's source code that is affected by the event that took place. */
  var EndLine: Double = js.native
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String = js.native
  /**
    * fully qualified name to address the module or function affected by the event that took place.
    *
    * If the module or function can't be addressed by name (for example, in case that a runtime-generated eval-module is executed), this string is empty.
    */
  var Name: String = js.native
  /** contains the interrupt reason. */
  var Reason: InterruptReason = js.native
  /**
    * source code of the Module affected by the event that took place.
    *
    * If the source can be accessed using the ModuleName, or if the source is unknown (executing compiled code), this string can be empty.
    */
  var SourceCode: String = js.native
  /** contains the first column in the "StartLine" that is affected by the event that took place. */
  var StartColumn: Double = js.native
  /**
    * contains the first line in the module's source code that is affected by the event that took place.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double = js.native
}

object InterruptEngineEvent {
  @scala.inline
  def apply(
    EndColumn: Double,
    EndLine: Double,
    ErrorMessage: String,
    Name: String,
    Reason: InterruptReason,
    Source: XInterface,
    SourceCode: String,
    StartColumn: Double,
    StartLine: Double
  ): InterruptEngineEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndLine = EndLine.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartLine = StartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterruptEngineEvent]
  }
  @scala.inline
  implicit class InterruptEngineEventOps[Self <: InterruptEngineEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: InterruptReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

