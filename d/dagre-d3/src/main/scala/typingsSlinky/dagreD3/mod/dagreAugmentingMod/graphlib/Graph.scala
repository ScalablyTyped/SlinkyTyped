package typingsSlinky.dagreD3.mod.dagreAugmentingMod.graphlib

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// coupled with dagre.d.ts' Graph
// a lot of these methods come from graphlib.core.js
@js.native
trait Graph extends js.Object {
  var height: Double = js.native
  // see source of http://cpettitt.github.io/project/dagre-d3/latest/demo/interactive-demo.html
  var transition: js.UndefOr[
    js.Function1[
      /* selection */ Selection_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ], 
      Transition_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ]
    ]
  ] = js.native
  var width: Double = js.native
  def graph(): Graph = js.native
  def predecessors(id: String): js.Array[String] = js.native
  def successors(id: String): js.Array[String] = js.native
}

object Graph {
  @scala.inline
  def apply(
    graph: () => Graph,
    height: Double,
    predecessors: String => js.Array[String],
    successors: String => js.Array[String],
    width: Double
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = js.Any.fromFunction0(graph), height = height.asInstanceOf[js.Any], predecessors = js.Any.fromFunction1(predecessors), successors = js.Any.fromFunction1(successors), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraph(value: () => Graph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredecessors(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccessors(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(
      value: /* selection */ Selection_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ] => Transition_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

