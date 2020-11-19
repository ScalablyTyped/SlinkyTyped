package typingsSlinky.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object withStylesWithStylesMod {
  
  type ClassKeyInferable[Theme, Props /* <: js.Object */] = java.lang.String | (typingsSlinky.materialUiStyles.withStylesWithStylesMod.Styles[Theme, Props, java.lang.String])
  
  type ClassKeyOfStyles[StylesOrClassKey] = js.Any | StylesOrClassKey
  
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[ClassKey, java.lang.String]
  
  type JSSFontface = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFace */ js.Any) with typingsSlinky.materialUiStyles.anon.Fallbacks
  
  type PropsFunc[Props /* <: js.Object */, T] = js.Function1[/* props */ Props, T]
  
  type PropsOfStyles[StylesType] = js.Object
  
  type StyleRules[Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[
    ClassKey, 
    typingsSlinky.materialUiStyles.withStylesWithStylesMod.CSSProperties | typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props] | (typingsSlinky.materialUiStyles.withStylesWithStylesMod.PropsFunc[
      Props, 
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props]
    ])
  ]
  
  type StyleRulesCallback[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ Theme, 
    typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  ]
  
  type Styles[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = (typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]) | (typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRulesCallback[Theme, Props, ClassKey])
  
  type ThemeOfStyles[StylesType] = js.Object
  
  type WithStyles[StylesType /* <: typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable[_, _] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | typingsSlinky.materialUiStyles.anon.Theme[StylesType]) with typingsSlinky.materialUiStyles.anon.Classes[StylesType] with typingsSlinky.materialUiStyles.withStylesWithStylesMod.PropsOfStyles[StylesType]
}
