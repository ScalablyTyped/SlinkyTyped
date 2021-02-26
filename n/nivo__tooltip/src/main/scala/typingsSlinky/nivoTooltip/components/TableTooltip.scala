package typingsSlinky.nivoTooltip.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nivoTooltip.tableTooltipMod.TableTooltipProps
import typingsSlinky.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree., Couldn't find props for (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any) | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any)))) with typingsSlinky.react.anon.`1` because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree., Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any)) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.)), Couldn't find props for (js.Any | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with js.Any)) with (typingsSlinky.react.mod.RefAttributes[
typingsSlinky.std.InstanceType[
  js.Function1[
  / * hasTitleRowsRenderContent * / typingsSlinky.nivoTooltip.tableTooltipMod.TableTooltipProps, 
  typingsSlinky.react.mod.global.JSX.Element | scala.Null
  ]
]]) because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree., Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  * / typingsSlinky.std.stdStrings.Pick with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object TableTooltip {
  
  def apply(
    p: ComponentPropsWithRef[
      js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, ReactElement | Null]
    ]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TableTooltip.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
