package typingsSlinky.clownface.contextMod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@js.native
trait Context[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] extends js.Object {
  
  var dataset: D = js.native
  
  var graph: js.UndefOr[QuadGraph] = js.native
  
  var term: T = js.native
}
object Context {
  
  @scala.inline
  def apply[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */](dataset: D, term: T): Context[D, T] = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[D, T]]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context[_, _], D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] (val x: Self with (Context[D, T])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataset(value: D): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: T): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph(value: QuadGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
  }
}
