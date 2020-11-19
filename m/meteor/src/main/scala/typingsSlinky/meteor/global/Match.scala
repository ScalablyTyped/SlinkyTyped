package typingsSlinky.meteor.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.meteor.Match.Matcher
import typingsSlinky.meteor.Match.Pattern
import typingsSlinky.meteor.Match.PatternMatch
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.StringConstructor
import typingsSlinky.std.global.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Match")
@js.native
object Match extends js.Object {
  
  var Any: Matcher[js.Any] = js.native
  
  var Integer: Matcher[Double] = js.native
  
  def Maybe(pattern: js.UndefOr[scala.Nothing]): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]] | Null]] = js.native
  def Maybe(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = js.native
  def Maybe(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = js.native
  def Maybe(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = js.native
  def Maybe(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null] | Null]] = js.native
  def Maybe[T /* <: (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typingsSlinky.std.global.Boolean]) | (ObjectConstructor with Instantiable0[js.Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, js.Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = js.native
  
  def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): Matcher[PatternMatch[T]] = js.native
  
  def OneOf[T /* <: js.Array[Pattern] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
  ): Matcher[
    PatternMatch[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
  
  def Optional(pattern: js.UndefOr[scala.Nothing]): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
  def Optional(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = js.native
  def Optional(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
  def Optional(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
  def Optional(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null]]] = js.native
  def Optional[T /* <: (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typingsSlinky.std.global.Boolean]) | (ObjectConstructor with Instantiable0[js.Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, js.Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = js.native
  
  def Where(condition: js.Function1[/* val */ js.Any, Boolean]): Matcher[_] = js.native
  
  def test(value: js.Any, pattern: js.UndefOr[scala.Nothing]): /* is meteor.Match.PatternMatch<undefined> */ Boolean = js.native
  def test(value: js.Any, pattern: String): /* is meteor.Match.PatternMatch<string> */ Boolean = js.native
  def test(value: js.Any, pattern: Boolean): /* is meteor.Match.PatternMatch<boolean> */ Boolean = js.native
  def test(value: js.Any, pattern: Double): /* is meteor.Match.PatternMatch<number> */ Boolean = js.native
  def test(value: js.Any, pattern: Null): /* is meteor.Match.PatternMatch<null> */ Boolean = js.native
  def test[T /* <: (StringConstructor with Instantiable0[typingsSlinky.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (BooleanConstructor with Instantiable0[typingsSlinky.std.global.Boolean]) | (ObjectConstructor with Instantiable0[js.Object]) | (FunctionConstructor with (Instantiable1[/* args (repeated) */ String, js.Function])) | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* is meteor.Match.PatternMatch<T> */ Boolean = js.native
}
