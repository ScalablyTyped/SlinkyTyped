package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.anon.BytesRead
import typingsSlinky.arangodb.anon.Count
import typingsSlinky.arangodb.anon.Deletion
import typingsSlinky.arangodb.anon.FileSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFigures extends js.Object {
  var alive: Count = js.native
  var attributes: Count = js.native
  var compactionStatus: BytesRead = js.native
  var compactors: FileSize = js.native
  var datafiles: FileSize = js.native
  var dead: Deletion = js.native
  var documentReferences: Double = js.native
  var indexes: Count = js.native
  var journals: FileSize = js.native
  var lastTick: Double = js.native
  var shapefiles: FileSize = js.native
  var shapes: Count = js.native
  var uncollectedLogfileEntries: Double = js.native
  var waitingFor: String = js.native
}

object CollectionFigures {
  @scala.inline
  def apply(
    alive: Count,
    attributes: Count,
    compactionStatus: BytesRead,
    compactors: FileSize,
    datafiles: FileSize,
    dead: Deletion,
    documentReferences: Double,
    indexes: Count,
    journals: FileSize,
    lastTick: Double,
    shapefiles: FileSize,
    shapes: Count,
    uncollectedLogfileEntries: Double,
    waitingFor: String
  ): CollectionFigures = {
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], compactionStatus = compactionStatus.asInstanceOf[js.Any], compactors = compactors.asInstanceOf[js.Any], datafiles = datafiles.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], documentReferences = documentReferences.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], journals = journals.asInstanceOf[js.Any], lastTick = lastTick.asInstanceOf[js.Any], shapefiles = shapefiles.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], uncollectedLogfileEntries = uncollectedLogfileEntries.asInstanceOf[js.Any], waitingFor = waitingFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFigures]
  }
  @scala.inline
  implicit class CollectionFiguresOps[Self <: CollectionFigures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlive(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactionStatus(value: BytesRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactors(value: FileSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatafiles(value: FileSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDead(value: Deletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentReferences(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexes(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJournals(value: FileSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapefiles(value: FileSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapefiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapes(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncollectedLogfileEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncollectedLogfileEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitingFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingFor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

