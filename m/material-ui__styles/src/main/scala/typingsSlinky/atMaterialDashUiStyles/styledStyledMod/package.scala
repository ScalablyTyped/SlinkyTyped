package typingsSlinky.atMaterialDashUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledStyledMod {
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement
  import typingsSlinky.atMaterialDashUiStyles.Anon_ClassName
  import typingsSlinky.atMaterialDashUiStyles.Anon_Theme
  import typingsSlinky.atMaterialDashUiStyles.Anon_ThemeOptional
  import typingsSlinky.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.root
  import typingsSlinky.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.theme
  import typingsSlinky.atMaterialDashUiStyles.defaultThemeMod.DefaultTheme
  import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.CreateCSSProperties
  import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.StyledComponentProps
  import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.WithStylesOptions
  import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesMod.CoerceEmptyInterface
  import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesMod.Omit

  type ComponentCreator[Component /* <: ReactElement */] = js.Function2[
    /* styles */ CreateCSSProperties[js.Any] | (js.Function1[
      /* props */ Anon_Theme[DefaultTheme] with CoerceEmptyInterface[_], 
      CreateCSSProperties[js.Any]
    ]), 
    /* options */ js.UndefOr[WithStylesOptions[DefaultTheme]], 
    ReactComponentClass[
      js.Object with StyledComponentProps[root] with Anon_ClassName with (CoerceEmptyInterface[(Omit[_, theme]) with Anon_ThemeOptional[DefaultTheme]])
    ]
  ]
}
