package typingsSlinky.rdfExt

import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixMapMod {
  
  @JSImport("rdf-ext/lib/PrefixMap", JSImport.Namespace)
  @js.native
  class ^ protected () extends PrefixMap {
    def this(factory: DataFactory[Quad, Quad], prefixes: Prefixes) = this()
  }
  
  @js.native
  trait PrefixMap extends StObject {
    
    def addAll(prefixes: PrefixesRecord): this.type = js.native
    
    def export(stream: Stream[Quad]): this.type = js.native
    
    var factory: DataFactory[Quad, Quad] = js.native
    
    def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
    
    var map: Record[String, NamedNode[String]] = js.native
    
    def resolve(curie: String): NamedNode[String] = js.native
    
    def shrink(iri: String): NamedNode[String] = js.native
  }
  object PrefixMap {
    
    @scala.inline
    def apply(
      addAll: PrefixesRecord => PrefixMap,
      export: Stream[Quad] => PrefixMap,
      factory: DataFactory[Quad, Quad],
      `import`: Stream[Quad] => js.Promise[PrefixMap],
      map: Record[String, NamedNode[String]],
      resolve: String => NamedNode[String],
      shrink: String => NamedNode[String]
    ): PrefixMap = {
      val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), export = js.Any.fromFunction1(export), factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), shrink = js.Any.fromFunction1(shrink))
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[PrefixMap]
    }
    
    @scala.inline
    implicit class PrefixMapMutableBuilder[Self <: PrefixMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAll(value: PrefixesRecord => PrefixMap): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExport(value: Stream[Quad] => PrefixMap): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImport(value: Stream[Quad] => js.Promise[PrefixMap]): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: Record[String, NamedNode[String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: String => NamedNode[String]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShrink(value: String => NamedNode[String]): Self = StObject.set(x, "shrink", js.Any.fromFunction1(value))
    }
  }
  
  type Prefixes = PrefixMap | PrefixesRecord
  
  type PrefixesRecord = Record[String, NamedNode[String] | String]
}
