package typingsSlinky.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileTreeOptions[RE, DE] extends js.Object {
  /**
    * Called whenever a directory node is added to the tree.
    *
    * Directory nodes can be supplemented by returning a new object from this
    * function.
    */
  val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode with DE]] = js.native
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  /**
    * Called whenever a file node is added to the tree.
    *
    * File nodes can be supplemented by returning a new object from this
    * function.
    */
  val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode with RE]] = js.native
  val walkerOptions: js.UndefOr[WalkerOptions] = js.native
}

object GetFileTreeOptions {
  @scala.inline
  def apply[RE, DE](): GetFileTreeOptions[RE, DE] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
  }
  @scala.inline
  implicit class GetFileTreeOptionsOps[Self[re, de] <: GetFileTreeOptions[re, de], RE, DE] (val x: Self[RE, DE]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RE, DE] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RE, DE]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[RE, DE]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[RE, DE]) with Other]
    @scala.inline
    def withOnDirectoryNode(value: /* node */ DirectoryNode => DirectoryNode with DE): Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirectoryNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDirectoryNode: Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDirectoryNode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => Unit): Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileNode(value: /* node */ RegularFileNode => RegularFileNode with RE): Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFileNode: Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileNode")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkerOptions(value: WalkerOptions): Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalkerOptions: Self[RE, DE] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkerOptions")(js.undefined)
        ret
    }
  }
  
}

