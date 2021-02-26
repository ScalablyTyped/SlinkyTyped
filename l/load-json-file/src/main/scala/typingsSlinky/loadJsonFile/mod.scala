package typingsSlinky.loadJsonFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Read and parse a JSON file.
  	Strips UTF-8 BOM, uses graceful-fs, and throws more helpful JSON errors.
  	@example
  	```
  	import loadJsonFile = require('load-json-file');
  	(async () => {
  		const json = await loadJsonFile('foo.json');
  		//=> {foo: true}
  	})();
  	```
  	*/
  @JSImport("load-json-file", JSImport.Namespace)
  @js.native
  def apply[T](filePath: String): js.Promise[T] = js.native
  @JSImport("load-json-file", JSImport.Namespace)
  @js.native
  def apply[T](filePath: String, options: Options): js.Promise[T] = js.native
  
  /**
  	Read and parse a JSON file.
  	Strips UTF-8 BOM, uses graceful-fs, and throws more helpful JSON errors.
  	@example
  	```
  	import loadJsonFile = require('load-json-file');
  	const json = loadJsonFile.sync('foo.json');
  	//=> {foo: true}
  	```
  	*/
  @JSImport("load-json-file", "sync")
  @js.native
  def sync[T](filePath: String): T = js.native
  @JSImport("load-json-file", "sync")
  @js.native
  def sync[T](filePath: String, options: Options): T = js.native
  
  type BeforeParse = js.Function1[/* data */ String, String]
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Applies a function to the JSON string before parsing.
    		*/
    val beforeParse: js.UndefOr[BeforeParse] = js.native
    
    /**
    		Prescribes how the value originally produced by parsing is transformed, before being returned.
    		See the [`JSON.parse` docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Using_the_reviver_parameter) for more.
    		*/
    val reviver: js.UndefOr[Reviver] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeParse(value: /* data */ String => String): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
      
      @scala.inline
      def setReviver(value: Reviver): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
}
