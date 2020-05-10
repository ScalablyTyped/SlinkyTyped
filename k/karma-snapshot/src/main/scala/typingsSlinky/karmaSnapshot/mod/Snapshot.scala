package typingsSlinky.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * details about snapshot.
  */
@js.native
trait Snapshot extends js.Object {
  /**
    * snapshot value that will be checked by an assertion plugin
    */
  var code: String = js.native
  /**
    * Flag that should be marked by an assertion plugin when it updates or adds a new snapshot
    */
  var dirty: js.UndefOr[Boolean] = js.native
  /**
    * which language should be used in a markdown format to improve readability
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * Flag that should be marked by an assertion plugin when it visits suites and snapshots.
    * Visited flags are used to automatically prune removed snapshots
    */
  var visited: js.UndefOr[Boolean] = js.native
}

object Snapshot {
  @scala.inline
  def apply(code: String): Snapshot = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withVisited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(js.undefined)
        ret
    }
  }
  
}

