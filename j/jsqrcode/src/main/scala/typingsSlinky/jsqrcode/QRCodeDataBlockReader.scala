package typingsSlinky.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeDataBlockReader extends StObject {
  
  val DataByte: js.Array[String | js.Array[Double]] = js.native
  
  def NextMode(): Double = js.native
  
  var bitPointer: Double = js.native
  
  var blockPointer: Double = js.native
  
  var blocks: js.Array[Double] = js.native
  
  var dataLength: Double = js.native
  
  var dataLengthMode: Double = js.native
  
  def get8bitByteArray(dataLength: Double): js.Array[Double] = js.native
  
  def getDataLength(modeIndicator: Double): Double = js.native
  
  def getFigureString(dataLength: Double): String = js.native
  
  def getKanjiString(dataLength: Double): String = js.native
  
  def getNextBits(numBits: Double): Double = js.native
  
  def getRomanAndFigureString(dataLength: Double): String = js.native
  
  var numErrorCorrectionCode: Double = js.native
  
  def parseECIValue(): Double = js.native
}
object QRCodeDataBlockReader {
  
  @scala.inline
  def apply(
    DataByte: js.Array[String | js.Array[Double]],
    NextMode: () => Double,
    bitPointer: Double,
    blockPointer: Double,
    blocks: js.Array[Double],
    dataLength: Double,
    dataLengthMode: Double,
    get8bitByteArray: Double => js.Array[Double],
    getDataLength: Double => Double,
    getFigureString: Double => String,
    getKanjiString: Double => String,
    getNextBits: Double => Double,
    getRomanAndFigureString: Double => String,
    numErrorCorrectionCode: Double,
    parseECIValue: () => Double
  ): QRCodeDataBlockReader = {
    val __obj = js.Dynamic.literal(DataByte = DataByte.asInstanceOf[js.Any], NextMode = js.Any.fromFunction0(NextMode), bitPointer = bitPointer.asInstanceOf[js.Any], blockPointer = blockPointer.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], dataLengthMode = dataLengthMode.asInstanceOf[js.Any], get8bitByteArray = js.Any.fromFunction1(get8bitByteArray), getDataLength = js.Any.fromFunction1(getDataLength), getFigureString = js.Any.fromFunction1(getFigureString), getKanjiString = js.Any.fromFunction1(getKanjiString), getNextBits = js.Any.fromFunction1(getNextBits), getRomanAndFigureString = js.Any.fromFunction1(getRomanAndFigureString), numErrorCorrectionCode = numErrorCorrectionCode.asInstanceOf[js.Any], parseECIValue = js.Any.fromFunction0(parseECIValue))
    __obj.asInstanceOf[QRCodeDataBlockReader]
  }
  
  @scala.inline
  implicit class QRCodeDataBlockReaderMutableBuilder[Self <: QRCodeDataBlockReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitPointer(value: Double): Self = StObject.set(x, "bitPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPointer(value: Double): Self = StObject.set(x, "blockPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocks(value: js.Array[Double]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: Double*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setDataByte(value: js.Array[String | js.Array[Double]]): Self = StObject.set(x, "DataByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataByteVarargs(value: (String | js.Array[Double])*): Self = StObject.set(x, "DataByte", js.Array(value :_*))
    
    @scala.inline
    def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLengthMode(value: Double): Self = StObject.set(x, "dataLengthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet8bitByteArray(value: Double => js.Array[Double]): Self = StObject.set(x, "get8bitByteArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataLength(value: Double => Double): Self = StObject.set(x, "getDataLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFigureString(value: Double => String): Self = StObject.set(x, "getFigureString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKanjiString(value: Double => String): Self = StObject.set(x, "getKanjiString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNextBits(value: Double => Double): Self = StObject.set(x, "getNextBits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRomanAndFigureString(value: Double => String): Self = StObject.set(x, "getRomanAndFigureString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextMode(value: () => Double): Self = StObject.set(x, "NextMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumErrorCorrectionCode(value: Double): Self = StObject.set(x, "numErrorCorrectionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseECIValue(value: () => Double): Self = StObject.set(x, "parseECIValue", js.Any.fromFunction0(value))
  }
}
