package typingsSlinky.ionicReact.componentsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.ionicReact.anon.ClickButton
import typingsSlinky.ionicReact.anon.ReadonlyProps
import typingsSlinky.ionicReact.ionBackButtonMod.Props
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components", "IonBackButton")
@js.native
class IonBackButton protected () extends ClickButton {
  def this(props: ReadonlyProps) = this()
  def this(props: Props) = this()
  def this(props: Props, context: js.Any) = this()
}

@JSImport("@ionic/react/dist/types/components", "IonBackButton")
@js.native
object IonBackButton
  extends Instantiable1[(/* props */ Props) | (/* props */ ReadonlyProps), ClickButton]
     with Instantiable2[/* props */ Props, /* context */ js.Any, ClickButton] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

