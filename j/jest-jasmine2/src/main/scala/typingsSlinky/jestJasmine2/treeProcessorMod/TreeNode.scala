package typingsSlinky.jestJasmine2.treeProcessorMod

import typingsSlinky.jestJasmine2.suiteMod.Suite
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  afterAllFns  :std.Array<any>,   beforeAllFns  :std.Array<any>,   disabled ? :boolean, execute (onComplete : (): void, enabled : boolean): void,   id  :string, onException (error : std.Error): void, sharedUserContext (): any,   children ? :std.Array<jest-jasmine2.jest-jasmine2/build/treeProcessor.TreeNode>} & std.Pick<jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, 'getResult' | 'parentSuite' | 'result'> */
@js.native
trait TreeNode extends js.Object {
  var afterAllFns: js.Array[_] = js.native
  var beforeAllFns: js.Array[_] = js.native
  var children: js.UndefOr[js.Array[TreeNode]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var getResult: js.Function0[SuiteResult] = js.native
  var id: String = js.native
  var parentSuite: js.UndefOr[Suite] = js.native
  var result: SuiteResult = js.native
  def execute(onComplete: js.Function0[Unit], enabled: Boolean): Unit = js.native
  def onException(error: js.Error): Unit = js.native
  def sharedUserContext(): js.Any = js.native
}

object TreeNode {
  @scala.inline
  def apply(
    afterAllFns: js.Array[_],
    beforeAllFns: js.Array[_],
    execute: (js.Function0[Unit], Boolean) => Unit,
    getResult: () => SuiteResult,
    id: String,
    onException: js.Error => Unit,
    result: SuiteResult,
    sharedUserContext: () => js.Any
  ): TreeNode = {
    val __obj = js.Dynamic.literal(afterAllFns = afterAllFns.asInstanceOf[js.Any], beforeAllFns = beforeAllFns.asInstanceOf[js.Any], execute = js.Any.fromFunction2(execute), getResult = js.Any.fromFunction0(getResult), id = id.asInstanceOf[js.Any], onException = js.Any.fromFunction1(onException), result = result.asInstanceOf[js.Any], sharedUserContext = js.Any.fromFunction0(sharedUserContext))
    __obj.asInstanceOf[TreeNode]
  }
  @scala.inline
  implicit class TreeNodeOps[Self <: TreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAllFns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllFns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeAllFns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAllFns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: (js.Function0[Unit], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetResult(value: () => SuiteResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnException(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResult(value: SuiteResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedUserContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedUserContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSuite(value: Suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSuite")(js.undefined)
        ret
    }
  }
  
}

