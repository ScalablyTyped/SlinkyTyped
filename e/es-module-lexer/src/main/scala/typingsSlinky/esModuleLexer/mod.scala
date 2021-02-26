package typingsSlinky.esModuleLexer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("es-module-lexer", "init")
  @js.native
  val init: js.Promise[Unit] = js.native
  
  @JSImport("es-module-lexer", "parse")
  @js.native
  def parse(source: String): js.Tuple2[js.Array[ImportSpecifier], js.Array[String]] = js.native
  @JSImport("es-module-lexer", "parse")
  @js.native
  def parse(source: String, name: String): js.Tuple2[js.Array[ImportSpecifier], js.Array[String]] = js.native
  
  @js.native
  trait ImportSpecifier extends StObject {
    
    /**
      * If this import statement is a dynamic import, this is the start value.
      * Otherwise this is `-1`.
      */
    var d: Double = js.native
    
    /**
      * End of module specifier
      */
    var e: Double = js.native
    
    /**
      * Start of module specifier
      * @example
      * const source = `import { a } from 'asdf'`;
      * const [imports, exports] = parse(source);
      * source.substring(imports[0].s, imports[0].e);
      * // Returns "asdf"
      */
    var s: Double = js.native
    
    /**
      * End of import statement
      */
    var se: Double = js.native
    
    /**
      * Start of import statement
      * @example
      * const source = `import { a } from 'asdf'`;
      * const [imports, exports] = parse(source);
      * source.substring(imports[0].s, imports[0].e);
      * // Returns "import { a } from 'asdf';"
      */
    var ss: Double = js.native
  }
  object ImportSpecifier {
    
    @scala.inline
    def apply(d: Double, e: Double, s: Double, se: Double, ss: Double): ImportSpecifier = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportSpecifier]
    }
    
    @scala.inline
    implicit class ImportSpecifierMutableBuilder[Self <: ImportSpecifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSe(value: Double): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSs(value: Double): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
}
