package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.rdfJs.mod.BaseQuad because Already inherited
- typingsSlinky.rdfJs.mod.Quad because var conflicts: graph, `object`, predicate, subject. Inlined graph_Quad, object_Quad, predicate_Quad, subject_Quad */ @JSImport("n3", "Quad")
@js.native
class Quad protected () extends BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typingsSlinky.rdfJs.mod.QuadGraph = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typingsSlinky.rdfJs.mod.QuadObject = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typingsSlinky.rdfJs.mod.QuadPredicate = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typingsSlinky.rdfJs.mod.QuadSubject = js.native
}

