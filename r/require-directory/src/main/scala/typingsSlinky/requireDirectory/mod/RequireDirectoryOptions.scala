package typingsSlinky.requireDirectory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireDirectoryOptions[T, U] extends js.Object {
  /**
    * @description RegExp or function for blacklisting modules
    * @default undefined
    */
  var exclude: js.UndefOr[js.RegExp | CheckPathFn] = js.native
  /**
    * @description array of file extensions that will be included in resulting hash as modules
    * @default "['js', 'json', 'coffee']"
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * @description RegExp or function for whitelisting modules
    * @default undefined
    */
  var include: js.UndefOr[js.RegExp | CheckPathFn] = js.native
  /**
    * @description option to include subdirectories
    * @default true
    */
  var recurse: js.UndefOr[Boolean] = js.native
  /**
    * @description function for renaming modules in resulting hash
    * @param name name of required module
    * @returns transformed name of module
    * @default "change nothing"
    */
  var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  /**
    * @description function that will be called for each required module
    * @param obj required module
    * @returns transformed module OR nothing (in second case module itself will be added to hash)
    * @default "change nothing"
    */
  var visit: js.UndefOr[js.Function1[/* obj */ T, U | Unit]] = js.native
}

object RequireDirectoryOptions {
  @scala.inline
  def apply[T, U](): RequireDirectoryOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireDirectoryOptions[T, U]]
  }
  @scala.inline
  implicit class RequireDirectoryOptionsOps[Self[t, u] <: RequireDirectoryOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withExcludeFunction1(value: /* path */ String => Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: js.RegExp | CheckPathFn): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFunction1(value: /* path */ String => Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: js.RegExp | CheckPathFn): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurse(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurse: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: /* name */ String => String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRename: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withVisit(value: /* obj */ T => U | Unit): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVisit: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.undefined)
        ret
    }
  }
  
}

