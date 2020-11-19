package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Execution of the {@link XCommand} animation node causes the slide show component to call back the application to perform the command. */
@js.native
trait XCommand extends XAnimationNode {
  
  /** This identifies the application specific command. See documentation of used application for commands. */
  var Command: Double = js.native
  
  /**
    * The application specific parameter for this command. See documentation of used application for supported parameters for different commands and target
    * combinations.
    */
  var Parameter: js.Any = js.native
  
  /** The application specific target. See documentation of used application for supported targets. */
  var Target: js.Any = js.native
}
object XCommand {
  
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Command: Double,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parameter: js.Any,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Target: js.Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XCommand = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XCommand]
  }
  
  @scala.inline
  implicit class XCommandOps[Self <: XCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: Double): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: js.Any): Self = this.set("Parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
}
