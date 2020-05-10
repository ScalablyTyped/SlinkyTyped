package typingsSlinky.awsSdkClientCodecommitNode.typesSubModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubModule extends js.Object {
  /**
    * <p>The fully qualified path to the folder that contains the reference to the submodule.</p>
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * <p>The commit ID that contains the reference to the submodule.</p>
    */
  var commitId: js.UndefOr[String] = js.native
  /**
    * <p>The relative path of the submodule from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.native
}

object SubModule {
  @scala.inline
  def apply(): SubModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubModule]
  }
  @scala.inline
  implicit class SubModuleOps[Self <: SubModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(js.undefined)
        ret
    }
  }
  
}

