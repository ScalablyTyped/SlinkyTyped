package typingsSlinky.rax.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.propTypes.mod.InferProps
import typingsSlinky.propTypes.mod.InferType
import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.ReactNodeLike
import typingsSlinky.rax.anon.Fn0
import typingsSlinky.rax.anon.Fn1
import typingsSlinky.rax.anon.Fn2
import typingsSlinky.rax.anon.Fn3
import typingsSlinky.rax.anon.FnCall
import typingsSlinky.rax.anon.FnCallType
import typingsSlinky.rax.anon.FnCallTypes
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaxPropTypes extends js.Object {
  
  def any(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("any")
  var any_Original: typingsSlinky.propTypes.mod.Requireable[_] = js.native
  
  def array(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  
  def arrayOf[T](`type`: typingsSlinky.propTypes.mod.Validator[T]): typingsSlinky.propTypes.mod.Requireable[js.Array[T]] = js.native
  @JSName("arrayOf")
  var arrayOf_Original: FnCallType = js.native
  
  @JSName("array")
  var array_Original: typingsSlinky.propTypes.mod.Requireable[js.Array[_]] = js.native
  
  def bool(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("bool")
  var bool_Original: typingsSlinky.propTypes.mod.Requireable[Boolean] = js.native
  
  def element(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("element")
  var element_Original: typingsSlinky.propTypes.mod.Requireable[ReactElementLike] = js.native
  
  def exact[P /* <: typingsSlinky.propTypes.mod.ValidationMap[_] */](`type`: P): typingsSlinky.propTypes.mod.Requireable[Required[InferProps[P]]] = js.native
  @JSName("exact")
  var exact_Original: Fn3 = js.native
  
  def func(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("func")
  var func_Original: typingsSlinky.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  def instanceOf[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): typingsSlinky.propTypes.mod.Requireable[T] = js.native
  @JSName("instanceOf")
  var instanceOf_Original: FnCall = js.native
  
  def node(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("node")
  var node_Original: typingsSlinky.propTypes.mod.Requireable[ReactNodeLike] = js.native
  
  def number(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("number")
  var number_Original: typingsSlinky.propTypes.mod.Requireable[Double] = js.native
  
  def `object`(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  
  def objectOf[T](`type`: typingsSlinky.propTypes.mod.Validator[T]): typingsSlinky.propTypes.mod.Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ typingsSlinky.rax.raxStrings.RaxPropTypes with TopLevel[js.Any]
  ] = js.native
  @JSName("objectOf")
  var objectOf_Original: Fn1 = js.native
  
  @JSName("object")
  var object_Original: typingsSlinky.propTypes.mod.Requireable[js.Object] = js.native
  
  def oneOf[T](types: js.Array[T]): typingsSlinky.propTypes.mod.Requireable[T] = js.native
  
  def oneOfType[T /* <: typingsSlinky.propTypes.mod.Validator[_] */](types: js.Array[T]): typingsSlinky.propTypes.mod.Requireable[NonNullable[InferType[T]]] = js.native
  @JSName("oneOfType")
  var oneOfType_Original: Fn0 = js.native
  
  @JSName("oneOf")
  var oneOf_Original: FnCallTypes = js.native
  
  def shape[P /* <: typingsSlinky.propTypes.mod.ValidationMap[_] */](`type`: P): typingsSlinky.propTypes.mod.Requireable[InferProps[P]] = js.native
  @JSName("shape")
  var shape_Original: Fn2 = js.native
  
  def string(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("string")
  var string_Original: typingsSlinky.propTypes.mod.Requireable[String] = js.native
}
