package typingsSlinky.antDesignIconsReact

import typingsSlinky.antDesignIconsReact.iconMod.TwoToneColorPalette
import typingsSlinky.antDesignIconsReact.iconMod.TwoToneColorPaletteSetter
import typingsSlinky.antDesignIconsReact.utilsMod.MiniMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons-react/es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default ()
    extends typingsSlinky.antDesignIconsReact.iconMod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any)*
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    var definitions: MiniMap[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ _
      ] = js.native
    
    var displayName: String = js.native
    
    def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    def get(key: js.UndefOr[scala.Nothing], colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ js.Any
      ] = js.native
    
    def getTwoToneColors(): TwoToneColorPalette = js.native
    
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
  }
}
