package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of a set of documents to listen to.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * A target specified by a set of document names.
    */
  var documents: js.UndefOr[SchemaDocumentsTarget] = js.native
  /**
    * If the target should be removed once it is current and consistent.
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * A target specified by a query.
    */
  var query: js.UndefOr[SchemaQueryTarget] = js.native
  /**
    * Start listening after a specific `read_time`.  The client must know the
    * state of matching documents at this time.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A resume token from a prior TargetChange for an identical target.  Using
    * a resume token with a different target is unsupported and may fail.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * A client provided target ID.  If not set, the server will assign an ID
    * for the target.  Used for resuming a target without changing IDs. The IDs
    * can either be client-assigned or be server-assigned in a previous stream.
    * All targets with client provided IDs must be added before adding a target
    * that needs a server-assigned id.
    */
  var targetId: js.UndefOr[Double] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  @scala.inline
  implicit class SchemaTargetOps[Self <: SchemaTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: SchemaDocumentsTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaQueryTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(js.undefined)
        ret
    }
  }
  
}

