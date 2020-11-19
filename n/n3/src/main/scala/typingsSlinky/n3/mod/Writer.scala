package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Writer")
@js.native
class Writer[Q /* <: typingsSlinky.rdfJs.mod.BaseQuad */] () extends js.Object {
  def this(fd: js.Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: js.Any, options: WriterOptions) = this()
  
  def addPrefix(prefix: String, iri: String): Unit = js.native
  def addPrefix(prefix: String, iri: String, done: js.Function0[Unit]): Unit = js.native
  def addPrefix(prefix: String, iri: typingsSlinky.rdfJs.mod.NamedNode[String]): Unit = js.native
  def addPrefix(prefix: String, iri: typingsSlinky.rdfJs.mod.NamedNode[String], done: js.Function0[Unit]): Unit = js.native
  
  def addPrefixes(prefixes: Prefixes[typingsSlinky.rdfJs.mod.NamedNode[String] | String]): Unit = js.native
  def addPrefixes(prefixes: Prefixes[typingsSlinky.rdfJs.mod.NamedNode[String] | String], done: js.Function0[Unit]): Unit = js.native
  
  def addQuad(quad: typingsSlinky.rdfJs.mod.Quad): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  
  def addQuads(quads: js.Array[typingsSlinky.rdfJs.mod.Quad]): Unit = js.native
  
  def blank(
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): BlankNode = js.native
  def blank(triple: js.Array[BlankTriple[typingsSlinky.rdfJs.mod.Quad] | typingsSlinky.rdfJs.mod.Quad]): BlankNode = js.native
  def blank(triple: BlankTriple[typingsSlinky.rdfJs.mod.Quad]): BlankNode = js.native
  def blank(triple: typingsSlinky.rdfJs.mod.Quad): BlankNode = js.native
  
  def end(): Unit = js.native
  def end(err: js.UndefOr[scala.Nothing], result: String): Unit = js.native
  def end(err: ErrorCallback): Unit = js.native
  def end(err: ErrorCallback, result: String): Unit = js.native
  
  @JSName("list")
  def list_object(
    triple: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ]
  ): js.Array[QuadObject] = js.native
  
  def quadToString(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): String = js.native
  def quadToString(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
  ): String = js.native
  
  def quadsToString(quads: js.Array[typingsSlinky.rdfJs.mod.Quad]): String = js.native
}
