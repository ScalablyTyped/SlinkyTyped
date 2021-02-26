package typingsSlinky.arcgisJsApi.global.esri

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.arcgisJsApi.anon.Items
import typingsSlinky.arcgisJsApi.esri.Constructor
import typingsSlinky.arcgisJsApi.esri.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Collection")
@js.native
class Collection[T] ()
  extends typingsSlinky.arcgisJsApi.esri.Collection[T] {
  def this(values: js.Array[_]) = this()
  def this(values: typingsSlinky.arcgisJsApi.esri.Collection[_]) = this()
}
/* static members */
object Collection {
  
  @JSGlobal("__esri.Collection.isCollection")
  @js.native
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  @JSGlobal("__esri.Collection.isCollection")
  @js.native
  def isCollection[T](value: typingsSlinky.arcgisJsApi.esri.Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  
  @JSGlobal("__esri.Collection.ofType")
  @js.native
  def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typingsSlinky.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typingsSlinky.arcgisJsApi.esri.Collection[T]
  ] = js.native
  @JSGlobal("__esri.Collection.ofType")
  @js.native
  def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typingsSlinky.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typingsSlinky.arcgisJsApi.esri.Collection[T]
  ] = js.native
}
