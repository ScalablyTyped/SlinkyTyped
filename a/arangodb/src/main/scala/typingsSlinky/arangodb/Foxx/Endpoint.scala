package typingsSlinky.arangodb.Foxx

import typingsSlinky.arangodb.ArangoDB.HttpStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends StObject {
  
  def body(description: String): this.type = js.native
  def body(schemaOrMimes: js.Array[Model | String], description: String): this.type = js.native
  def body(schemaOrMimes: Model, description: String): this.type = js.native
  def body(schemaOrMimes: Schema, description: String): this.type = js.native
  def body(schema: js.Array[Model | String]): this.type = js.native
  def body(schema: js.Array[Model], mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def body(schema: js.Array[Model], mimes: js.Array[String]): this.type = js.native
  def body(schema: js.Array[Model], mimes: js.Array[String], description: String): this.type = js.native
  def body(schema: Model): this.type = js.native
  def body(schema: Model, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def body(schema: Model, mimes: js.Array[String]): this.type = js.native
  def body(schema: Model, mimes: js.Array[String], description: String): this.type = js.native
  def body(schema: Schema): this.type = js.native
  def body(schema: Schema, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def body(schema: Schema, mimes: js.Array[String]): this.type = js.native
  def body(schema: Schema, mimes: js.Array[String], description: String): this.type = js.native
  
  def deprecated(deprecated: Boolean): this.type = js.native
  
  def description(description: String): this.type = js.native
  
  def error(status: Double, description: String): this.type = js.native
  def error(status: HttpStatus, description: String): this.type = js.native
  
  def header(name: String, description: String): this.type = js.native
  def header(name: String, schema: Schema): this.type = js.native
  def header(name: String, schema: Schema, description: String): this.type = js.native
  
  def pathParam(name: String, description: String): this.type = js.native
  def pathParam(name: String, schema: Schema): this.type = js.native
  def pathParam(name: String, schema: Schema, description: String): this.type = js.native
  
  def queryParam(name: String, description: String): this.type = js.native
  def queryParam(name: String, schema: Schema): this.type = js.native
  def queryParam(name: String, schema: Schema, description: String): this.type = js.native
  
  def response(status: Double, description: String): this.type = js.native
  def response(status: Double, mimes: js.Array[String], description: String): this.type = js.native
  def response(status: Double, schema: js.Array[Model | String]): this.type = js.native
  def response(status: Double, schema: js.Array[Model], mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: Double, schema: js.Array[Model], mimes: js.Array[String]): this.type = js.native
  def response(status: Double, schema: js.Array[Model], mimes: js.Array[String], description: String): this.type = js.native
  def response(status: Double, schema: Model): this.type = js.native
  def response(status: Double, schema: Model, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: Double, schema: Model, mimes: js.Array[String]): this.type = js.native
  def response(status: Double, schema: Model, mimes: js.Array[String], description: String): this.type = js.native
  def response(status: Double, schema: Schema): this.type = js.native
  def response(status: Double, schema: Schema, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: Double, schema: Schema, mimes: js.Array[String]): this.type = js.native
  def response(status: Double, schema: Schema, mimes: js.Array[String], description: String): this.type = js.native
  def response(status: HttpStatus, description: String): this.type = js.native
  def response(status: HttpStatus, mimes: js.Array[String], description: String): this.type = js.native
  def response(status: HttpStatus, schema: js.Array[Model | String]): this.type = js.native
  def response(status: HttpStatus, schema: js.Array[Model], mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: HttpStatus, schema: js.Array[Model], mimes: js.Array[String]): this.type = js.native
  def response(status: HttpStatus, schema: js.Array[Model], mimes: js.Array[String], description: String): this.type = js.native
  def response(status: HttpStatus, schema: Model): this.type = js.native
  def response(status: HttpStatus, schema: Model, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: HttpStatus, schema: Model, mimes: js.Array[String]): this.type = js.native
  def response(status: HttpStatus, schema: Model, mimes: js.Array[String], description: String): this.type = js.native
  def response(status: HttpStatus, schema: Schema): this.type = js.native
  def response(status: HttpStatus, schema: Schema, mimes: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def response(status: HttpStatus, schema: Schema, mimes: js.Array[String]): this.type = js.native
  def response(status: HttpStatus, schema: Schema, mimes: js.Array[String], description: String): this.type = js.native
  
  def summary(summary: String): this.type = js.native
  
  def tag(tags: String*): this.type = js.native
}
