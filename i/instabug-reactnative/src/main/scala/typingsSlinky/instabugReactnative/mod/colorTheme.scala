package typingsSlinky.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait colorTheme extends StObject
@JSImport("instabug-reactnative", "colorTheme")
@js.native
object colorTheme extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[colorTheme with Double] = js.native
  
  @js.native
  sealed trait dark extends colorTheme
  /* 1 */ val dark: typingsSlinky.instabugReactnative.mod.colorTheme.dark with Double = js.native
  
  @js.native
  sealed trait light extends colorTheme
  /* 0 */ val light: typingsSlinky.instabugReactnative.mod.colorTheme.light with Double = js.native
}
