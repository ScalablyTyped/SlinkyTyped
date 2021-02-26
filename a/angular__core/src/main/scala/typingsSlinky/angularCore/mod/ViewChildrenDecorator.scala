package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.angularCore.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewChildrenDecorator
  extends Instantiable1[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typingsSlinky.angularCore.mod.Type[js.Any]), 
      typingsSlinky.angularCore.mod.ViewChildren
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typingsSlinky.angularCore.mod.Type[js.Any]), 
      /* opts */ `0`, 
      typingsSlinky.angularCore.mod.ViewChildren
    ] {
  
  def apply(selector: String): js.Any = js.native
  def apply(selector: String, opts: `0`): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: `0`): js.Any = js.native
  def apply(selector: InjectionToken[_]): js.Any = js.native
  def apply(selector: InjectionToken[_], opts: `0`): js.Any = js.native
  /**
    * Parameter decorator that configures a view query.
    *
    * Use to get the `QueryList` of elements or directives from the view DOM.
    * Any time a child element is added, removed, or moved, the query list will be updated,
    * and the changes observable of the query list will emit a new value.
    *
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - Used to read a different token from the queried elements.
    *
    * @usageNotes
    *
    * {@example core/di/ts/viewChildren/view_children_howto.ts region='HowTo'}
    *
    * ### Another example
    *
    * {@example core/di/ts/viewChildren/view_children_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: typingsSlinky.angularCore.mod.Type[_]): js.Any = js.native
  def apply(selector: typingsSlinky.angularCore.mod.Type[_], opts: `0`): js.Any = js.native
}
