package typingsSlinky.atFormatjsIntlDashUtils

import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.boolean
import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.string
import typingsSlinky.atFormatjsIntlDashUtils.distDiffMod.Thresholds
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatNotation
import typingsSlinky.atFormatjsIntlDashUtils.distPolyfillDashUtilsMod.LiteralPart
import typingsSlinky.atFormatjsIntlDashUtils.distResolveDashLocaleMod.ResolveLocaleResult
import typingsSlinky.atFormatjsIntlDashUtils.distTypesMod.LocaleData
import typingsSlinky.std.Date
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object atFormatjsIntlDashUtilsMod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Anon_K, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def defaultNumberOption(`val`: js.Any, min: Double, max: Double, fallback: Double): Double = js.native
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getCanonicalLocales(): js.Array[String] = js.native
  def getCanonicalLocales(locales: String): js.Array[String] = js.native
  def getCanonicalLocales(locales: js.Array[String]): js.Array[String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  def getNumberOption[T /* <: js.Object */, K /* <: String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: boolean, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: string, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  def getParentLocalesByLang(lang: String): Record[String, String] = js.native
  def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): /* asserts condition */ Boolean = js.native
  def isLiteralPart(patternPart: Anon_Type): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: js.Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[Anon_TypeValue | Anon_TypeValueString] = js.native
  def removeUnitNamespace(unit: String): String = js.native
  def selectUnit(from: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[Internal, K]): Unit = js.native
  def setNumberFormatDigitOptions[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    pl: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: Anon_Bestfit): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
  @js.native
  object InternalSlotToken extends js.Object {
    /* "compactName" */ val compactName: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.compactName with String = js.native
    /* "compactSymbol" */ val compactSymbol: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.compactSymbol with String = js.native
    /* "currencyCode" */ val currencyCode: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyCode with String = js.native
    /* "currencyName" */ val currencyName: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyName with String = js.native
    /* "currencyNarrowSymbol" */ val currencyNarrowSymbol: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyNarrowSymbol with String = js.native
    /* "currencySymbol" */ val currencySymbol: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencySymbol with String = js.native
    /* "minusSign" */ val minusSign: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.minusSign with String = js.native
    /* "number" */ val number: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.number with String = js.native
    /* "percentSign" */ val percentSign: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.percentSign with String = js.native
    /* "plusSign" */ val plusSign: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.plusSign with String = js.native
    /* "scientificExponent" */ val scientificExponent: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.scientificExponent with String = js.native
    /* "scientificSeparator" */ val scientificSeparator: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.scientificSeparator with String = js.native
    /* "unitName" */ val unitName: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitName with String = js.native
    /* "unitNarrowSymbol" */ val unitNarrowSymbol: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitNarrowSymbol with String = js.native
    /* "unitSymbol" */ val unitSymbol: typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitSymbol with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken with String
      ] = js.native
  }
  
}

