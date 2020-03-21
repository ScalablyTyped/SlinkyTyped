package typingsSlinky.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledStyledMod {
  type ComponentCreator[Component /* <: slinky.core.facade.ReactElement */] = js.Function2[
    /* styles */ typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object] | (js.Function1[
      /* props */ typingsSlinky.materialUiStyles.AnonTheme[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme] with js.Object, 
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object]
    ]), 
    /* options */ js.UndefOr[
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme]
    ], 
    slinky.core.ReactComponentClass[
      (typingsSlinky.materialUiTypes.mod.Omit[
        typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes[Component, typingsSlinky.react.mod.ComponentProps[Component]], 
        typingsSlinky.materialUiStyles.materialUiStylesStrings.classes | typingsSlinky.materialUiStyles.materialUiStylesStrings.className
      ]) with typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyledComponentProps[typingsSlinky.materialUiStyles.materialUiStylesStrings.root] with typingsSlinky.materialUiStyles.AnonClassName with (js.Object | ((typingsSlinky.materialUiTypes.mod.Omit[js.Object, typingsSlinky.materialUiStyles.materialUiStylesStrings.theme]) with typingsSlinky.materialUiStyles.AnonThemeTheme[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme]))
    ]
  ]
}
