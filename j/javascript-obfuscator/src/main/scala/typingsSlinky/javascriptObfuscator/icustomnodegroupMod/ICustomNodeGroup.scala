package typingsSlinky.javascriptObfuscator.icustomnodegroupMod

import typingsSlinky.javascriptObfuscator.icustomnodeMod.ICustomNode
import typingsSlinky.javascriptObfuscator.iinitializableMod.IInitializable
import typingsSlinky.javascriptObfuscator.istacktracedataMod.IStackTraceData
import typingsSlinky.javascriptObfuscator.tnodewithstatementsMod.TNodeWithStatements
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomNodeGroup
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param nodeWithStatements
    * @param stackTraceData
    */
  def appendCustomNodes(nodeWithStatements: TNodeWithStatements, stackTraceData: js.Array[IStackTraceData]): Unit = js.native
  /**
    * @returns {ObfuscationEvent}
    */
  def getAppendEvent(): js.Any = js.native
  /**
    * @type {Map <CustomNode, ICustomNode>}
    */
  def getCustomNodes(): Map[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
    ICustomNode
  ] = js.native
  def initialize(): Unit = js.native
}

object ICustomNodeGroup {
  @scala.inline
  def apply(
    appendCustomNodes: (TNodeWithStatements, js.Array[IStackTraceData]) => Unit,
    getAppendEvent: () => js.Any,
    getCustomNodes: () => Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
      ICustomNode
    ],
    initialize: () => Unit
  ): ICustomNodeGroup = {
    val __obj = js.Dynamic.literal(appendCustomNodes = js.Any.fromFunction2(appendCustomNodes), getAppendEvent = js.Any.fromFunction0(getAppendEvent), getCustomNodes = js.Any.fromFunction0(getCustomNodes), initialize = js.Any.fromFunction0(initialize))
    __obj.asInstanceOf[ICustomNodeGroup]
  }
  @scala.inline
  implicit class ICustomNodeGroupOps[Self <: ICustomNodeGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendCustomNodes(value: (TNodeWithStatements, js.Array[IStackTraceData]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendCustomNodes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAppendEvent(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppendEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomNodes(
      value: () => Map[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ _, 
          ICustomNode
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

