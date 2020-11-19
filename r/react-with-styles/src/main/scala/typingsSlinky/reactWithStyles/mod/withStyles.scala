package typingsSlinky.reactWithStyles.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactWithStyles.reactWithStylesStrings.styles
import typingsSlinky.reactWithStyles.reactWithStylesStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-with-styles", "withStyles")
@js.native
object withStyles extends js.Object {
  
  def apply[T](): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[
      Omit[
        ElementConfig[ReactComponentClass[_]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ typingsSlinky.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ]
    ]
  ] = js.native
  def apply[T](styleFn: js.UndefOr[scala.Nothing], options: WithStylesOptions): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[
      Omit[
        ElementConfig[ReactComponentClass[_]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ typingsSlinky.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ]
    ]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles]): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[
      Omit[
        ElementConfig[ReactComponentClass[_]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ typingsSlinky.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ]
    ]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles], options: WithStylesOptions): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[
      Omit[
        ElementConfig[ReactComponentClass[_]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ typingsSlinky.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ]
    ]
  ] = js.native
  def apply[T](styleFn: Null, options: WithStylesOptions): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[
      Omit[
        ElementConfig[ReactComponentClass[_]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ typingsSlinky.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ]
    ]
  ] = js.native
}
