package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.PartialInputState
import typingsSlinky.antd.inputGroupMod.GroupProps
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.antd.inputInputMod.InputState
import typingsSlinky.antd.inputMod.default
import typingsSlinky.antd.passwordMod.PasswordProps
import typingsSlinky.antd.searchMod.SearchProps
import typingsSlinky.antd.textAreaMod.TextAreaProps
import typingsSlinky.antd.textAreaMod.TextAreaRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Input")
@js.native
class Input protected () extends default {
  def this(props: InputProps) = this()
}
object Input {
  
  @JSImport("antd", "Input")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* was `typeof Group` */
  @JSImport("antd", "Input.Group")
  @js.native
  def Group: ReactComponentClass[GroupProps] = js.native
  @scala.inline
  def Group_=(x: ReactComponentClass[GroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* was `typeof Password` */
  @JSImport("antd", "Input.Password")
  @js.native
  def Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
  @scala.inline
  def Password_=(x: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Password")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* was `typeof Search` */
  @JSImport("antd", "Input.Search")
  @js.native
  def Search: ForwardRefExoticComponent[SearchProps with RefAttributes[typingsSlinky.antd.inputInputMod.default]] = js.native
  @scala.inline
  def Search_=(
    x: ForwardRefExoticComponent[SearchProps with RefAttributes[typingsSlinky.antd.inputInputMod.default]]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Search")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* was `typeof TextArea` */
  @JSImport("antd", "Input.TextArea")
  @js.native
  def TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]] = js.native
  @scala.inline
  def TextArea_=(x: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextArea")(x.asInstanceOf[js.Any])
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd", "Input.defaultProps.type")
    @js.native
    val `type`: String = js.native
  }
  
  /* static member */
  @JSImport("antd", "Input.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}
