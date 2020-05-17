package typingsSlinky.formatjsIntlUtils

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.formatjsIntlUtils.anon.Dictk
import typingsSlinky.formatjsIntlUtils.anon.LocaleMatcher
import typingsSlinky.formatjsIntlUtils.anon.PartialThresholds
import typingsSlinky.formatjsIntlUtils.anon.Type
import typingsSlinky.formatjsIntlUtils.anon.TypeValue
import typingsSlinky.formatjsIntlUtils.anon.Value
import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.boolean
import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.string
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typingsSlinky.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
import typingsSlinky.formatjsIntlUtils.resolveLocaleMod.ResolveLocaleResult
import typingsSlinky.formatjsIntlUtils.typesMod.LocaleData
import typingsSlinky.std.Exclude
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.createResolveLocale with TopLevel[js.Any] */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Dictk, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def defaultNumberOption(`val`: js.Any, min: Double, max: Double, fallback: Double): Double = js.native
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getCanonicalLocales(): js.Array[String] = js.native
  def getCanonicalLocales(locales: String): js.Array[String] = js.native
  def getCanonicalLocales(locales: js.Array[String]): js.Array[String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  def getNumberOption[T /* <: js.Object */, K /* <: /* keyof T */ String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.UndefOr[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: string,
    values: js.UndefOr[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  def getParentLocalesByLang(lang: String): Record[String, String] = js.native
  def invariant(condition: Boolean, message: String): Unit = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): Unit = js.native
  def isLiteralPart(patternPart: Type): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: js.Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def isWellFormedCurrencyCode(currency: String): Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[Value | TypeValue] = js.native
  def removeUnitNamespace(unit: String): String = js.native
  def selectUnit(from: Double): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: Double, to: Double): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: Double, to: Double, thresholds: PartialThresholds): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: Double, to: js.Date): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: Double, to: js.Date, thresholds: PartialThresholds): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: js.Date): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: js.Date, to: Double): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: js.Date, to: Double, thresholds: PartialThresholds): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: js.Date, to: js.Date): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def selectUnit(from: js.Date, to: js.Date, thresholds: PartialThresholds): typingsSlinky.formatjsIntlUtils.anon.Unit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
  def setNumberFormatDigitOptions[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    intlObj: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def toString(o: js.Any): String = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
  @js.native
  object InternalSlotToken extends js.Object {
    /* "compactName" */ val compactName: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactName with String = js.native
    /* "compactSymbol" */ val compactSymbol: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactSymbol with String = js.native
    /* "currencyCode" */ val currencyCode: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyCode with String = js.native
    /* "currencyName" */ val currencyName: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyName with String = js.native
    /* "currencyNarrowSymbol" */ val currencyNarrowSymbol: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyNarrowSymbol with String = js.native
    /* "currencySymbol" */ val currencySymbol: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencySymbol with String = js.native
    /* "minusSign" */ val minusSign: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.minusSign with String = js.native
    /* "number" */ val number: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.number with String = js.native
    /* "percentSign" */ val percentSign: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.percentSign with String = js.native
    /* "plusSign" */ val plusSign: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.plusSign with String = js.native
    /* "scientificExponent" */ val scientificExponent: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificExponent with String = js.native
    /* "scientificSeparator" */ val scientificSeparator: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificSeparator with String = js.native
    /* "unitName" */ val unitName: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitName with String = js.native
    /* "unitNarrowSymbol" */ val unitNarrowSymbol: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitNarrowSymbol with String = js.native
    /* "unitSymbol" */ val unitSymbol: typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitSymbol with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.formatjsIntlUtils.numberTypesMod.InternalSlotToken with String] = js.native
  }
  
}

