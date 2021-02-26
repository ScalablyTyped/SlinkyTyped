package typingsSlinky.jsonBigint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(text: String): js.Any = js.native
    def apply(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): js.Any = js.native
  }
  
  @js.native
  trait FnCallValueReplacerSpace extends StObject {
    
    def apply(value: js.Any): String = js.native
    def apply(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
    def apply(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def apply(value: js.Any, replacer: Null, space: String): String = js.native
    def apply(value: js.Any, replacer: Null, space: Double): String = js.native
  }
  
  @js.native
  trait Parse extends StObject
  
  @js.native
  trait Stringify extends StObject {
    
    def parse(text: String): js.Any = js.native
    def parse(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): js.Any = js.native
    @JSName("parse")
    var parse_Original: FnCall = js.native
    
    def stringify(value: js.Any): String = js.native
    def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def stringify(value: js.Any, replacer: Null, space: String): String = js.native
    def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
    @JSName("stringify")
    var stringify_Original: FnCallValueReplacerSpace = js.native
  }
}
