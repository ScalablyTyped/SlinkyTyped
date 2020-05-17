package typingsSlinky.rdfExt.prefixMapMod

import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixMap extends Prefixes {
  var factory: DataFactory[Quad, Quad] = js.native
  var map: Record[String, NamedNode] = js.native
  def addAll(prefixes: PrefixesRecord): this.type = js.native
  def export(stream: Stream[Quad]): this.type = js.native
  def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
  def resolve(curie: String): NamedNode = js.native
  def shrink(iri: String): NamedNode = js.native
}

object PrefixMap {
  @scala.inline
  def apply(
    addAll: PrefixesRecord => PrefixMap,
    export: Stream[Quad] => PrefixMap,
    factory: DataFactory[Quad, Quad],
    `import`: Stream[Quad] => js.Promise[PrefixMap],
    map: Record[String, NamedNode],
    resolve: String => NamedNode,
    shrink: String => NamedNode
  ): PrefixMap = {
    val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), export = js.Any.fromFunction1(export), factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), shrink = js.Any.fromFunction1(shrink))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[PrefixMap]
  }
  @scala.inline
  implicit class PrefixMapOps[Self <: PrefixMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAll(value: PrefixesRecord => PrefixMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: Stream[Quad] => PrefixMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFactory(value: DataFactory[Quad, Quad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport(value: Stream[Quad] => js.Promise[PrefixMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: Record[String, NamedNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: String => NamedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShrink(value: String => NamedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

