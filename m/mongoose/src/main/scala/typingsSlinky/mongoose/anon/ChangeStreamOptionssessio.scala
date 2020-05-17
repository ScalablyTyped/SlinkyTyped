package typingsSlinky.mongoose.anon

import typingsSlinky.bson.mod.Timestamp
import typingsSlinky.mongodb.mod.CollationDocument
import typingsSlinky.mongodb.mod.ReadPreferenceOrMode
import typingsSlinky.mongodb.mod.ResumeToken
import typingsSlinky.mongoose.mod.ClientSession
import typingsSlinky.mongoose.mongooseStrings.default
import typingsSlinky.mongoose.mongooseStrings.updateLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.ChangeStreamOptions & {  session ? :mongoose.mongoose.ClientSession} */
@js.native
trait ChangeStreamOptionssessio extends js.Object {
  var batchSize: js.UndefOr[Double] = js.native
  var collation: js.UndefOr[CollationDocument] = js.native
  var fullDocument: js.UndefOr[default | updateLookup] = js.native
  var maxAwaitTimeMS: js.UndefOr[Double] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var resumeAfter: js.UndefOr[ResumeToken] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var startAfter: js.UndefOr[ResumeToken] = js.native
  var startAtOperationTime: js.UndefOr[Timestamp] = js.native
}

object ChangeStreamOptionssessio {
  @scala.inline
  def apply(): ChangeStreamOptionssessio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptionssessio]
  }
  @scala.inline
  implicit class ChangeStreamOptionssessioOps[Self <: ChangeStreamOptionssessio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: CollationDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withFullDocument(value: default | updateLookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAwaitTimeMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAwaitTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAwaitTimeMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAwaitTimeMS")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeAfter(value: ResumeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAfter(value: ResumeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAtOperationTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAtOperationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAtOperationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAtOperationTime")(js.undefined)
        ret
    }
  }
  
}

