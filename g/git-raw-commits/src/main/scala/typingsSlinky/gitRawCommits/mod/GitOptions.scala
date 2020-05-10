package typingsSlinky.gitRawCommits.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Please check the available options at http://git-scm.com/docs/git-log.
  *
  * @remarks
  * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
  *
  * @remarks
  * For `<revision range>` we can also use `<from>..<to>` pattern, and this
  * module has the following extra options for shortcut of this pattern:
  *
  * * `from`
  * * `to`
  *
  * This module also have the following additions:
  *
  * * `format`
  * * `debug`
  * * `path`
  */
@js.native
trait GitOptions
  extends /* options */ StringDictionary[js.Any] {
  /**
    * A function to get debug information.
    */
  var debug: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
    * Please check http://git-scm.com/docs/git-log for format options.
    *
    * @default
    * '%B'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * @default
    * ''
    */
  var from: js.UndefOr[String] = js.native
  /**
    * Filter commits to the path provided.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * @default
    * 'HEAD'
    */
  var to: js.UndefOr[String] = js.native
}

object GitOptions {
  @scala.inline
  def apply(): GitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitOptions]
  }
  @scala.inline
  implicit class GitOptionsOps[Self <: GitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: /* message */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

