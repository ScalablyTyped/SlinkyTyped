package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.optionsMod.INumberFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
  @js.native
  class NumberFormatter protected () extends StObject {
    def this(options: INumberFormatterOptions) = this()
    
    var appendDigits: js.Any = js.native
    
    var appendGroupedInteger: js.Any = js.native
    
    var createCustomFormatLists: js.Any = js.native
    
    var custom: js.Any = js.native
    
    var digits: js.Any = js.native
    
    var fillDigitInfo: js.Any = js.native
    
    var fillFormatInfo: js.Any = js.native
    
    def format(format: String, value: Double): String = js.native
    
    var formatCurrency: js.Any = js.native
    
    var formatCustom: js.Any = js.native
    
    var formatCustomCore: js.Any = js.native
    
    var formatDecimal: js.Any = js.native
    
    var formatExp: js.Any = js.native
    
    var formatExpCore: js.Any = js.native
    
    var formatFixed: js.Any = js.native
    
    var formatGeneral: js.Any = js.native
    
    var formatHex: js.Any = js.native
    
    var formatNumber: js.Any = js.native
    
    var formatPercent: js.Any = js.native
    
    val options: js.Any = js.native
    
    var pointPos: js.Any = js.native
    
    var positive: js.Any = js.native
    
    var prec: js.Any = js.native
    
    var round: js.Any = js.native
    
    var selectCustomFormatSection: js.Any = js.native
    
    var spec: js.Any = js.native
    
    var upper: js.Any = js.native
  }
  /* static members */
  object NumberFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.createCustomFormatInfo")
    @js.native
    def createCustomFormatInfo: js.Any = js.native
    @scala.inline
    def createCustomFormatInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCustomFormatInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.getCustomFormatSections")
    @js.native
    def getCustomFormatSections: js.Any = js.native
    @scala.inline
    def getCustomFormatSections_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCustomFormatSections")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.parseCustomFormatSection")
    @js.native
    def parseCustomFormatSection: js.Any = js.native
    @scala.inline
    def parseCustomFormatSection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseCustomFormatSection")(x.asInstanceOf[js.Any])
  }
}
