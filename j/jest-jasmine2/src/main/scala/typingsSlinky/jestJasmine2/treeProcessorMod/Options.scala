package typingsSlinky.jestJasmine2.treeProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var queueRunnerFactory: js.Any = js.native
  var runnableIds: js.Array[String] = js.native
  var tree: TreeNode = js.native
  def nodeComplete(suite: TreeNode): Unit = js.native
  def nodeStart(suite: TreeNode): Unit = js.native
}

object Options {
  @scala.inline
  def apply(
    nodeComplete: TreeNode => Unit,
    nodeStart: TreeNode => Unit,
    queueRunnerFactory: js.Any,
    runnableIds: js.Array[String],
    tree: TreeNode
  ): Options = {
    val __obj = js.Dynamic.literal(nodeComplete = js.Any.fromFunction1(nodeComplete), nodeStart = js.Any.fromFunction1(nodeStart), queueRunnerFactory = queueRunnerFactory.asInstanceOf[js.Any], runnableIds = runnableIds.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeComplete(value: TreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNodeStart(value: TreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueueRunnerFactory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueRunnerFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunnableIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runnableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: TreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

