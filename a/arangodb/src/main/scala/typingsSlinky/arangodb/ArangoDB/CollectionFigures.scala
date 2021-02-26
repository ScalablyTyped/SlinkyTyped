package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.anon.BytesRead
import typingsSlinky.arangodb.anon.Count
import typingsSlinky.arangodb.anon.Deletion
import typingsSlinky.arangodb.anon.FileSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionFigures extends StObject {
  
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
  implicit class CollectionFiguresMutableBuilder[Self <: CollectionFigures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlive(value: Count): Self = StObject.set(x, "alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Count): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactionStatus(value: BytesRead): Self = StObject.set(x, "compactionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactors(value: FileSize): Self = StObject.set(x, "compactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafiles(value: FileSize): Self = StObject.set(x, "datafiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDead(value: Deletion): Self = StObject.set(x, "dead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentReferences(value: Double): Self = StObject.set(x, "documentReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexes(value: Count): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournals(value: FileSize): Self = StObject.set(x, "journals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTick(value: Double): Self = StObject.set(x, "lastTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapefiles(value: FileSize): Self = StObject.set(x, "shapefiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: Count): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncollectedLogfileEntries(value: Double): Self = StObject.set(x, "uncollectedLogfileEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingFor(value: String): Self = StObject.set(x, "waitingFor", value.asInstanceOf[js.Any])
  }
}
