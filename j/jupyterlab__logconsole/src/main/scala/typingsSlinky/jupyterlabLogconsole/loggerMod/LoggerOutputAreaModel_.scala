package typingsSlinky.jupyterlabLogconsole.loggerMod

import typingsSlinky.jupyterlabLogconsole.anon.LastModel
import typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions
import typingsSlinky.jupyterlabOutputarea.mod.OutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
- typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel because Already inherited
- typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
@js.native
class LoggerOutputAreaModel_ protected () extends OutputAreaModel {
  def this(hasMaxLengthOptions: IOptions) = this()
  
  /**
    * Manually apply length limit.
    */
  var _applyMaxLength: js.Any = js.native
  
  var _maxLength: js.Any = js.native
  
  /**
    * Maximum number of outputs to store in the model.
    */
  def maxLength: Double = js.native
  def maxLength_=(value: Double): Unit = js.native
  /**
    * The maximum number of outputs to store.
    */
  @JSName("maxLength")
  var maxLength_FLoggerOutputAreaModel_ : Double = js.native
  
  /**
    * Whether an output should combine with the previous output.
    *
    * We combine if the two outputs are in the same second, which is the
    * resolution for our time display.
    */
  /* protected */ def shouldCombine(options: LastModel): Boolean = js.native
}
