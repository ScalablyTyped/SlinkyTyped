package typingsSlinky.atAntDashDesignIconsDashReact

import typingsSlinky.atAntDashDesignIcons.libTypesMod.IconDefinition
import typingsSlinky.atAntDashDesignIconsDashReact.libComponentsIconMod.TwoToneColorPalette
import typingsSlinky.atAntDashDesignIconsDashReact.libComponentsIconMod.TwoToneColorPaletteSetter
import typingsSlinky.atAntDashDesignIconsDashReact.libUtilsMod.MiniMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-react/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.atAntDashDesignIconsDashReact.libComponentsIconMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var definitions: MiniMap[IconDefinition] = js.native
    var displayName: String = js.native
    def add(icons: IconDefinition*): Unit = js.native
    def clear(): Unit = js.native
    def get(): js.UndefOr[IconDefinition] = js.native
    def get(key: String): js.UndefOr[IconDefinition] = js.native
    def get(key: String, colors: TwoToneColorPalette): js.UndefOr[IconDefinition] = js.native
    def getTwoToneColors(): TwoToneColorPalette = js.native
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
  }
  
}

