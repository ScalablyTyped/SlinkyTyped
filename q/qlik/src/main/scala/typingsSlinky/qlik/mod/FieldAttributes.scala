package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikNumbers.`0`
import typingsSlinky.qlik.qlikNumbers.`10`
import typingsSlinky.qlik.qlikNumbers.`11`
import typingsSlinky.qlik.qlikNumbers.`12`
import typingsSlinky.qlik.qlikNumbers.`13`
import typingsSlinky.qlik.qlikNumbers.`14`
import typingsSlinky.qlik.qlikNumbers.`15`
import typingsSlinky.qlik.qlikNumbers.`1`
import typingsSlinky.qlik.qlikNumbers.`2`
import typingsSlinky.qlik.qlikNumbers.`3`
import typingsSlinky.qlik.qlikNumbers.`4`
import typingsSlinky.qlik.qlikNumbers.`5`
import typingsSlinky.qlik.qlikNumbers.`6`
import typingsSlinky.qlik.qlikNumbers.`7`
import typingsSlinky.qlik.qlikNumbers.`8`
import typingsSlinky.qlik.qlikNumbers.`9`
import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.F
import typingsSlinky.qlik.qlikStrings.I
import typingsSlinky.qlik.qlikStrings.IV
import typingsSlinky.qlik.qlikStrings.M
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.T
import typingsSlinky.qlik.qlikStrings.TS
import typingsSlinky.qlik.qlikStrings.U
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldAttributes extends StObject {
  
  var qDec: String = js.native
  
  var qFmt: String = js.native
  
  var qSAFEARRAY: js.Array[_] = js.native
  
  var qThou: String = js.native
  
  var qType: U | A | I | R | F | M | D | T | TS | IV = js.native
  
  var qUseThou: `0` | `1` = js.native
  
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
}
object FieldAttributes {
  
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldAttributes]
  }
  
  @scala.inline
  implicit class FieldAttributesMutableBuilder[Self <: FieldAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDec(value: String): Self = StObject.set(x, "qDec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFmt(value: String): Self = StObject.set(x, "qFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSAFEARRAY(value: js.Array[_]): Self = StObject.set(x, "qSAFEARRAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSAFEARRAYVarargs(value: js.Any*): Self = StObject.set(x, "qSAFEARRAY", js.Array(value :_*))
    
    @scala.inline
    def setQThou(value: String): Self = StObject.set(x, "qThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: U | A | I | R | F | M | D | T | TS | IV): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUseThou(value: `0` | `1`): Self = StObject.set(x, "qUseThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQnDec(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "qnDec", value.asInstanceOf[js.Any])
  }
}
