package typingsSlinky.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object styledStyledMod {
  
  type ComponentCreator[Component /* <: slinky.core.facade.ReactElement */] = js.Function2[
    /* styles */ typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[typingsSlinky.react.mod.ComponentPropsWithoutRef[Component]] | (js.Function1[
      /* props */ typingsSlinky.materialUiStyles.anon.ThemeTheme[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme] with typingsSlinky.react.mod.ComponentPropsWithoutRef[Component], 
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[typingsSlinky.react.mod.ComponentPropsWithoutRef[Component]]
    ]), 
    /* options */ js.UndefOr[
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme]
    ], 
    typingsSlinky.materialUiStyles.styledStyledMod.StyledComponent[
      (typingsSlinky.materialUiTypes.mod.Omit[
        typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[Component, typingsSlinky.react.mod.ComponentProps[Component]], 
        typingsSlinky.materialUiStyles.materialUiStylesStrings.classes | typingsSlinky.materialUiStyles.materialUiStylesStrings.className
      ]) with typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyledComponentProps[typingsSlinky.materialUiStyles.materialUiStylesStrings.root] with (typingsSlinky.materialUiTypes.mod.Overwrite[
        typingsSlinky.react.mod.ComponentPropsWithoutRef[Component], 
        typingsSlinky.materialUiStyles.anon.ClassName[typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme]
      ])
    ]
  ]
  
  type StyledComponent[P /* <: js.Object */] = js.Function1[/* props */ P, slinky.core.facade.ReactElement | scala.Null]
}
