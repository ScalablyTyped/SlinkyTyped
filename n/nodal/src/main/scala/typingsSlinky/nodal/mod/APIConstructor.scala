package typingsSlinky.nodal.mod

import typingsSlinky.nodal.anon.Count
import typingsSlinky.nodal.anon.Data
import typingsSlinky.nodal.anon.Fields
import typingsSlinky.nodal.anon.Meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends StObject {
  
  def error(message: String, details: String): Meta = js.native
  
  def format(obj: js.Any): Data = js.native
  def format(obj: js.Any, arrInterface: js.Array[String]): Data = js.native
  
  def meta(total: Double, count: Double, offset: Double, error: js.Any): Count = js.native
  def meta(
    total: Double,
    count: Double,
    offset: Double,
    error: js.Any,
    summary: js.UndefOr[scala.Nothing],
    resource: js.Any
  ): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String, resource: js.Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: Null, resource: js.Any): Count = js.native
  
  def resourceFromArray(arr: js.Array[_]): Fields = js.native
  
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  
  def response(itemArray: js.Any, arrInterface: js.Any): Data = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: Boolean): Data = js.native
  
  def spoof(obj: js.Any): Data = js.native
  def spoof(obj: js.Any, useResource: Boolean): Data = js.native
}
