package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTok extends js.Object {
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit = js.native
  def deleteArchive(archiveId: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
  def generateToken(sessionId: String, options: TokenOptions): Token = js.native
  def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
}

object OpenTok {
  @scala.inline
  def apply(
    createSession: (SessionOptions, js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]) => Unit,
    deleteArchive: (String, js.Function1[/* error */ js.Error | Null, Unit]) => Unit,
    generateToken: (String, TokenOptions) => Token,
    getArchive: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit,
    listArchives: (ListArchivesOptions, js.Function3[
      /* error */ js.Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]) => Unit,
    startArchive: (String, ArchiveOptions, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit,
    stopArchive: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit
  ): OpenTok = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction2(createSession), deleteArchive = js.Any.fromFunction2(deleteArchive), generateToken = js.Any.fromFunction2(generateToken), getArchive = js.Any.fromFunction2(getArchive), listArchives = js.Any.fromFunction2(listArchives), startArchive = js.Any.fromFunction3(startArchive), stopArchive = js.Any.fromFunction2(stopArchive))
    __obj.asInstanceOf[OpenTok]
  }
  @scala.inline
  implicit class OpenTokOps[Self <: OpenTok] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSession(
      value: (SessionOptions, js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSession")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteArchive(value: (String, js.Function1[/* error */ js.Error | Null, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArchive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGenerateToken(value: (String, TokenOptions) => Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetArchive(
      value: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListArchives(
      value: (ListArchivesOptions, js.Function3[
          /* error */ js.Error | Null, 
          /* archives */ js.UndefOr[js.Array[Archive]], 
          /* totalCount */ js.UndefOr[Double], 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listArchives")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartArchive(
      value: (String, ArchiveOptions, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArchive")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStopArchive(
      value: (String, js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopArchive")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

