package typingsSlinky.googleAnalytics

import typingsSlinky.googleAnalytics.anon.EventAction
import typingsSlinky.googleAnalytics.anon.EventCategory
import typingsSlinky.googleAnalytics.anon.SocialAction
import typingsSlinky.googleAnalytics.anon.TimingCategory
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.create
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.event
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.provide
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.remove
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.require
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.send
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.social
import typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UniversalAnalytics {
  
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference
  @js.native
  trait FieldsObject extends StObject {
    
    var affiliation: js.UndefOr[String] = js.native
    
    var allowAnchor: js.UndefOr[Boolean] = js.native
    
    var allowLinker: js.UndefOr[Boolean] = js.native
    
    var alwaysSendReferrer: js.UndefOr[Boolean] = js.native
    
    var anonymizeIp: js.UndefOr[Boolean] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var appInstallerId: js.UndefOr[String] = js.native
    
    var appName: js.UndefOr[String] = js.native
    
    var appVersion: js.UndefOr[String] = js.native
    
    var brand: js.UndefOr[String] = js.native
    
    var campaignContent: js.UndefOr[String] = js.native
    
    var campaignId: js.UndefOr[String] = js.native
    
    var campaignKeyword: js.UndefOr[String] = js.native
    
    var campaignMedium: js.UndefOr[String] = js.native
    
    var campaignName: js.UndefOr[String] = js.native
    
    var campaignSource: js.UndefOr[String] = js.native
    
    var category: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var contentGroup1: js.UndefOr[String] = js.native
    
    var contentGroup10: js.UndefOr[String] = js.native
    
    var contentGroup2: js.UndefOr[String] = js.native
    
    var contentGroup3: js.UndefOr[String] = js.native
    
    var contentGroup4: js.UndefOr[String] = js.native
    
    var contentGroup5: js.UndefOr[String] = js.native
    
    var contentGroup6: js.UndefOr[String] = js.native
    
    var contentGroup7: js.UndefOr[String] = js.native
    
    var contentGroup8: js.UndefOr[String] = js.native
    
    var contentGroup9: js.UndefOr[String] = js.native
    
    var cookieDomain: js.UndefOr[String] = js.native
    
    var cookieExpires: js.UndefOr[Double] = js.native
    
    var cookieName: js.UndefOr[String] = js.native
    
    var cookiePath: js.UndefOr[String] = js.native
    
    var coupon: js.UndefOr[String] = js.native
    
    var creative: js.UndefOr[String] = js.native
    
    var currencyCode: js.UndefOr[String] = js.native
    
    var dataSource: js.UndefOr[String] = js.native
    
    var dimension1: js.UndefOr[String] = js.native
    
    var dimension10: js.UndefOr[String] = js.native
    
    var dimension100: js.UndefOr[String] = js.native
    
    var dimension101: js.UndefOr[String] = js.native
    
    var dimension102: js.UndefOr[String] = js.native
    
    var dimension103: js.UndefOr[String] = js.native
    
    var dimension104: js.UndefOr[String] = js.native
    
    var dimension105: js.UndefOr[String] = js.native
    
    var dimension106: js.UndefOr[String] = js.native
    
    var dimension107: js.UndefOr[String] = js.native
    
    var dimension108: js.UndefOr[String] = js.native
    
    var dimension109: js.UndefOr[String] = js.native
    
    var dimension11: js.UndefOr[String] = js.native
    
    var dimension110: js.UndefOr[String] = js.native
    
    var dimension111: js.UndefOr[String] = js.native
    
    var dimension112: js.UndefOr[String] = js.native
    
    var dimension113: js.UndefOr[String] = js.native
    
    var dimension114: js.UndefOr[String] = js.native
    
    var dimension115: js.UndefOr[String] = js.native
    
    var dimension116: js.UndefOr[String] = js.native
    
    var dimension117: js.UndefOr[String] = js.native
    
    var dimension118: js.UndefOr[String] = js.native
    
    var dimension119: js.UndefOr[String] = js.native
    
    var dimension12: js.UndefOr[String] = js.native
    
    var dimension120: js.UndefOr[String] = js.native
    
    var dimension121: js.UndefOr[String] = js.native
    
    var dimension122: js.UndefOr[String] = js.native
    
    var dimension123: js.UndefOr[String] = js.native
    
    var dimension124: js.UndefOr[String] = js.native
    
    var dimension125: js.UndefOr[String] = js.native
    
    var dimension126: js.UndefOr[String] = js.native
    
    var dimension127: js.UndefOr[String] = js.native
    
    var dimension128: js.UndefOr[String] = js.native
    
    var dimension129: js.UndefOr[String] = js.native
    
    var dimension13: js.UndefOr[String] = js.native
    
    var dimension130: js.UndefOr[String] = js.native
    
    var dimension131: js.UndefOr[String] = js.native
    
    var dimension132: js.UndefOr[String] = js.native
    
    var dimension133: js.UndefOr[String] = js.native
    
    var dimension134: js.UndefOr[String] = js.native
    
    var dimension135: js.UndefOr[String] = js.native
    
    var dimension136: js.UndefOr[String] = js.native
    
    var dimension137: js.UndefOr[String] = js.native
    
    var dimension138: js.UndefOr[String] = js.native
    
    var dimension139: js.UndefOr[String] = js.native
    
    var dimension14: js.UndefOr[String] = js.native
    
    var dimension140: js.UndefOr[String] = js.native
    
    var dimension141: js.UndefOr[String] = js.native
    
    var dimension142: js.UndefOr[String] = js.native
    
    var dimension143: js.UndefOr[String] = js.native
    
    var dimension144: js.UndefOr[String] = js.native
    
    var dimension145: js.UndefOr[String] = js.native
    
    var dimension146: js.UndefOr[String] = js.native
    
    var dimension147: js.UndefOr[String] = js.native
    
    var dimension148: js.UndefOr[String] = js.native
    
    var dimension149: js.UndefOr[String] = js.native
    
    var dimension15: js.UndefOr[String] = js.native
    
    var dimension150: js.UndefOr[String] = js.native
    
    var dimension151: js.UndefOr[String] = js.native
    
    var dimension152: js.UndefOr[String] = js.native
    
    var dimension153: js.UndefOr[String] = js.native
    
    var dimension154: js.UndefOr[String] = js.native
    
    var dimension155: js.UndefOr[String] = js.native
    
    var dimension156: js.UndefOr[String] = js.native
    
    var dimension157: js.UndefOr[String] = js.native
    
    var dimension158: js.UndefOr[String] = js.native
    
    var dimension159: js.UndefOr[String] = js.native
    
    var dimension16: js.UndefOr[String] = js.native
    
    var dimension160: js.UndefOr[String] = js.native
    
    var dimension161: js.UndefOr[String] = js.native
    
    var dimension162: js.UndefOr[String] = js.native
    
    var dimension163: js.UndefOr[String] = js.native
    
    var dimension164: js.UndefOr[String] = js.native
    
    var dimension165: js.UndefOr[String] = js.native
    
    var dimension166: js.UndefOr[String] = js.native
    
    var dimension167: js.UndefOr[String] = js.native
    
    var dimension168: js.UndefOr[String] = js.native
    
    var dimension169: js.UndefOr[String] = js.native
    
    var dimension17: js.UndefOr[String] = js.native
    
    var dimension170: js.UndefOr[String] = js.native
    
    var dimension171: js.UndefOr[String] = js.native
    
    var dimension172: js.UndefOr[String] = js.native
    
    var dimension173: js.UndefOr[String] = js.native
    
    var dimension174: js.UndefOr[String] = js.native
    
    var dimension175: js.UndefOr[String] = js.native
    
    var dimension176: js.UndefOr[String] = js.native
    
    var dimension177: js.UndefOr[String] = js.native
    
    var dimension178: js.UndefOr[String] = js.native
    
    var dimension179: js.UndefOr[String] = js.native
    
    var dimension18: js.UndefOr[String] = js.native
    
    var dimension180: js.UndefOr[String] = js.native
    
    var dimension181: js.UndefOr[String] = js.native
    
    var dimension182: js.UndefOr[String] = js.native
    
    var dimension183: js.UndefOr[String] = js.native
    
    var dimension184: js.UndefOr[String] = js.native
    
    var dimension185: js.UndefOr[String] = js.native
    
    var dimension186: js.UndefOr[String] = js.native
    
    var dimension187: js.UndefOr[String] = js.native
    
    var dimension188: js.UndefOr[String] = js.native
    
    var dimension189: js.UndefOr[String] = js.native
    
    var dimension19: js.UndefOr[String] = js.native
    
    var dimension190: js.UndefOr[String] = js.native
    
    var dimension191: js.UndefOr[String] = js.native
    
    var dimension192: js.UndefOr[String] = js.native
    
    var dimension193: js.UndefOr[String] = js.native
    
    var dimension194: js.UndefOr[String] = js.native
    
    var dimension195: js.UndefOr[String] = js.native
    
    var dimension196: js.UndefOr[String] = js.native
    
    var dimension197: js.UndefOr[String] = js.native
    
    var dimension198: js.UndefOr[String] = js.native
    
    var dimension199: js.UndefOr[String] = js.native
    
    var dimension2: js.UndefOr[String] = js.native
    
    var dimension20: js.UndefOr[String] = js.native
    
    var dimension200: js.UndefOr[String] = js.native
    
    var dimension21: js.UndefOr[String] = js.native
    
    var dimension22: js.UndefOr[String] = js.native
    
    var dimension23: js.UndefOr[String] = js.native
    
    var dimension24: js.UndefOr[String] = js.native
    
    var dimension25: js.UndefOr[String] = js.native
    
    var dimension26: js.UndefOr[String] = js.native
    
    var dimension27: js.UndefOr[String] = js.native
    
    var dimension28: js.UndefOr[String] = js.native
    
    var dimension29: js.UndefOr[String] = js.native
    
    var dimension3: js.UndefOr[String] = js.native
    
    var dimension30: js.UndefOr[String] = js.native
    
    var dimension31: js.UndefOr[String] = js.native
    
    var dimension32: js.UndefOr[String] = js.native
    
    var dimension33: js.UndefOr[String] = js.native
    
    var dimension34: js.UndefOr[String] = js.native
    
    var dimension35: js.UndefOr[String] = js.native
    
    var dimension36: js.UndefOr[String] = js.native
    
    var dimension37: js.UndefOr[String] = js.native
    
    var dimension38: js.UndefOr[String] = js.native
    
    var dimension39: js.UndefOr[String] = js.native
    
    var dimension4: js.UndefOr[String] = js.native
    
    var dimension40: js.UndefOr[String] = js.native
    
    var dimension41: js.UndefOr[String] = js.native
    
    var dimension42: js.UndefOr[String] = js.native
    
    var dimension43: js.UndefOr[String] = js.native
    
    var dimension44: js.UndefOr[String] = js.native
    
    var dimension45: js.UndefOr[String] = js.native
    
    var dimension46: js.UndefOr[String] = js.native
    
    var dimension47: js.UndefOr[String] = js.native
    
    var dimension48: js.UndefOr[String] = js.native
    
    var dimension49: js.UndefOr[String] = js.native
    
    var dimension5: js.UndefOr[String] = js.native
    
    var dimension50: js.UndefOr[String] = js.native
    
    var dimension51: js.UndefOr[String] = js.native
    
    var dimension52: js.UndefOr[String] = js.native
    
    var dimension53: js.UndefOr[String] = js.native
    
    var dimension54: js.UndefOr[String] = js.native
    
    var dimension55: js.UndefOr[String] = js.native
    
    var dimension56: js.UndefOr[String] = js.native
    
    var dimension57: js.UndefOr[String] = js.native
    
    var dimension58: js.UndefOr[String] = js.native
    
    var dimension59: js.UndefOr[String] = js.native
    
    var dimension6: js.UndefOr[String] = js.native
    
    var dimension60: js.UndefOr[String] = js.native
    
    var dimension61: js.UndefOr[String] = js.native
    
    var dimension62: js.UndefOr[String] = js.native
    
    var dimension63: js.UndefOr[String] = js.native
    
    var dimension64: js.UndefOr[String] = js.native
    
    var dimension65: js.UndefOr[String] = js.native
    
    var dimension66: js.UndefOr[String] = js.native
    
    var dimension67: js.UndefOr[String] = js.native
    
    var dimension68: js.UndefOr[String] = js.native
    
    var dimension69: js.UndefOr[String] = js.native
    
    var dimension7: js.UndefOr[String] = js.native
    
    var dimension70: js.UndefOr[String] = js.native
    
    var dimension71: js.UndefOr[String] = js.native
    
    var dimension72: js.UndefOr[String] = js.native
    
    var dimension73: js.UndefOr[String] = js.native
    
    var dimension74: js.UndefOr[String] = js.native
    
    var dimension75: js.UndefOr[String] = js.native
    
    var dimension76: js.UndefOr[String] = js.native
    
    var dimension77: js.UndefOr[String] = js.native
    
    var dimension78: js.UndefOr[String] = js.native
    
    var dimension79: js.UndefOr[String] = js.native
    
    var dimension8: js.UndefOr[String] = js.native
    
    var dimension80: js.UndefOr[String] = js.native
    
    var dimension81: js.UndefOr[String] = js.native
    
    var dimension82: js.UndefOr[String] = js.native
    
    var dimension83: js.UndefOr[String] = js.native
    
    var dimension84: js.UndefOr[String] = js.native
    
    var dimension85: js.UndefOr[String] = js.native
    
    var dimension86: js.UndefOr[String] = js.native
    
    var dimension87: js.UndefOr[String] = js.native
    
    var dimension88: js.UndefOr[String] = js.native
    
    var dimension89: js.UndefOr[String] = js.native
    
    var dimension9: js.UndefOr[String] = js.native
    
    var dimension90: js.UndefOr[String] = js.native
    
    var dimension91: js.UndefOr[String] = js.native
    
    var dimension92: js.UndefOr[String] = js.native
    
    var dimension93: js.UndefOr[String] = js.native
    
    var dimension94: js.UndefOr[String] = js.native
    
    var dimension95: js.UndefOr[String] = js.native
    
    var dimension96: js.UndefOr[String] = js.native
    
    var dimension97: js.UndefOr[String] = js.native
    
    var dimension98: js.UndefOr[String] = js.native
    
    var dimension99: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var eventAction: js.UndefOr[String] = js.native
    
    var eventCategory: js.UndefOr[String] = js.native
    
    var eventLabel: js.UndefOr[String] = js.native
    
    var eventValue: js.UndefOr[Double] = js.native
    
    var exDescription: js.UndefOr[String] = js.native
    
    var exFatal: js.UndefOr[Boolean] = js.native
    
    var expId: js.UndefOr[String] = js.native
    
    var expVar: js.UndefOr[String] = js.native
    
    var flashVersion: js.UndefOr[String] = js.native
    
    var forceSSL: js.UndefOr[Boolean] = js.native
    
    var hitCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var hitType: js.UndefOr[HitType] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var javaEnabled: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var legacyCookieDomain: js.UndefOr[String] = js.native
    
    var legacyHistoryImport: js.UndefOr[Boolean] = js.native
    
    var linkid: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var metric1: js.UndefOr[String | Double] = js.native
    
    var metric10: js.UndefOr[String | Double] = js.native
    
    var metric100: js.UndefOr[String | Double] = js.native
    
    var metric101: js.UndefOr[String | Double] = js.native
    
    var metric102: js.UndefOr[String | Double] = js.native
    
    var metric103: js.UndefOr[String | Double] = js.native
    
    var metric104: js.UndefOr[String | Double] = js.native
    
    var metric105: js.UndefOr[String | Double] = js.native
    
    var metric106: js.UndefOr[String | Double] = js.native
    
    var metric107: js.UndefOr[String | Double] = js.native
    
    var metric108: js.UndefOr[String | Double] = js.native
    
    var metric109: js.UndefOr[String | Double] = js.native
    
    var metric11: js.UndefOr[String | Double] = js.native
    
    var metric110: js.UndefOr[String | Double] = js.native
    
    var metric111: js.UndefOr[String | Double] = js.native
    
    var metric112: js.UndefOr[String | Double] = js.native
    
    var metric113: js.UndefOr[String | Double] = js.native
    
    var metric114: js.UndefOr[String | Double] = js.native
    
    var metric115: js.UndefOr[String | Double] = js.native
    
    var metric116: js.UndefOr[String | Double] = js.native
    
    var metric117: js.UndefOr[String | Double] = js.native
    
    var metric118: js.UndefOr[String | Double] = js.native
    
    var metric119: js.UndefOr[String | Double] = js.native
    
    var metric12: js.UndefOr[String | Double] = js.native
    
    var metric120: js.UndefOr[String | Double] = js.native
    
    var metric121: js.UndefOr[String | Double] = js.native
    
    var metric122: js.UndefOr[String | Double] = js.native
    
    var metric123: js.UndefOr[String | Double] = js.native
    
    var metric124: js.UndefOr[String | Double] = js.native
    
    var metric125: js.UndefOr[String | Double] = js.native
    
    var metric126: js.UndefOr[String | Double] = js.native
    
    var metric127: js.UndefOr[String | Double] = js.native
    
    var metric128: js.UndefOr[String | Double] = js.native
    
    var metric129: js.UndefOr[String | Double] = js.native
    
    var metric13: js.UndefOr[String | Double] = js.native
    
    var metric130: js.UndefOr[String | Double] = js.native
    
    var metric131: js.UndefOr[String | Double] = js.native
    
    var metric132: js.UndefOr[String | Double] = js.native
    
    var metric133: js.UndefOr[String | Double] = js.native
    
    var metric134: js.UndefOr[String | Double] = js.native
    
    var metric135: js.UndefOr[String | Double] = js.native
    
    var metric136: js.UndefOr[String | Double] = js.native
    
    var metric137: js.UndefOr[String | Double] = js.native
    
    var metric138: js.UndefOr[String | Double] = js.native
    
    var metric139: js.UndefOr[String | Double] = js.native
    
    var metric14: js.UndefOr[String | Double] = js.native
    
    var metric140: js.UndefOr[String | Double] = js.native
    
    var metric141: js.UndefOr[String | Double] = js.native
    
    var metric142: js.UndefOr[String | Double] = js.native
    
    var metric143: js.UndefOr[String | Double] = js.native
    
    var metric144: js.UndefOr[String | Double] = js.native
    
    var metric145: js.UndefOr[String | Double] = js.native
    
    var metric146: js.UndefOr[String | Double] = js.native
    
    var metric147: js.UndefOr[String | Double] = js.native
    
    var metric148: js.UndefOr[String | Double] = js.native
    
    var metric149: js.UndefOr[String | Double] = js.native
    
    var metric15: js.UndefOr[String | Double] = js.native
    
    var metric150: js.UndefOr[String | Double] = js.native
    
    var metric151: js.UndefOr[String | Double] = js.native
    
    var metric152: js.UndefOr[String | Double] = js.native
    
    var metric153: js.UndefOr[String | Double] = js.native
    
    var metric154: js.UndefOr[String | Double] = js.native
    
    var metric155: js.UndefOr[String | Double] = js.native
    
    var metric156: js.UndefOr[String | Double] = js.native
    
    var metric157: js.UndefOr[String | Double] = js.native
    
    var metric158: js.UndefOr[String | Double] = js.native
    
    var metric159: js.UndefOr[String | Double] = js.native
    
    var metric16: js.UndefOr[String | Double] = js.native
    
    var metric160: js.UndefOr[String | Double] = js.native
    
    var metric161: js.UndefOr[String | Double] = js.native
    
    var metric162: js.UndefOr[String | Double] = js.native
    
    var metric163: js.UndefOr[String | Double] = js.native
    
    var metric164: js.UndefOr[String | Double] = js.native
    
    var metric165: js.UndefOr[String | Double] = js.native
    
    var metric166: js.UndefOr[String | Double] = js.native
    
    var metric167: js.UndefOr[String | Double] = js.native
    
    var metric168: js.UndefOr[String | Double] = js.native
    
    var metric169: js.UndefOr[String | Double] = js.native
    
    var metric17: js.UndefOr[String | Double] = js.native
    
    var metric170: js.UndefOr[String | Double] = js.native
    
    var metric171: js.UndefOr[String | Double] = js.native
    
    var metric172: js.UndefOr[String | Double] = js.native
    
    var metric173: js.UndefOr[String | Double] = js.native
    
    var metric174: js.UndefOr[String | Double] = js.native
    
    var metric175: js.UndefOr[String | Double] = js.native
    
    var metric176: js.UndefOr[String | Double] = js.native
    
    var metric177: js.UndefOr[String | Double] = js.native
    
    var metric178: js.UndefOr[String | Double] = js.native
    
    var metric179: js.UndefOr[String | Double] = js.native
    
    var metric18: js.UndefOr[String | Double] = js.native
    
    var metric180: js.UndefOr[String | Double] = js.native
    
    var metric181: js.UndefOr[String | Double] = js.native
    
    var metric182: js.UndefOr[String | Double] = js.native
    
    var metric183: js.UndefOr[String | Double] = js.native
    
    var metric184: js.UndefOr[String | Double] = js.native
    
    var metric185: js.UndefOr[String | Double] = js.native
    
    var metric186: js.UndefOr[String | Double] = js.native
    
    var metric187: js.UndefOr[String | Double] = js.native
    
    var metric188: js.UndefOr[String | Double] = js.native
    
    var metric189: js.UndefOr[String | Double] = js.native
    
    var metric19: js.UndefOr[String | Double] = js.native
    
    var metric190: js.UndefOr[String | Double] = js.native
    
    var metric191: js.UndefOr[String | Double] = js.native
    
    var metric192: js.UndefOr[String | Double] = js.native
    
    var metric193: js.UndefOr[String | Double] = js.native
    
    var metric194: js.UndefOr[String | Double] = js.native
    
    var metric195: js.UndefOr[String | Double] = js.native
    
    var metric196: js.UndefOr[String | Double] = js.native
    
    var metric197: js.UndefOr[String | Double] = js.native
    
    var metric198: js.UndefOr[String | Double] = js.native
    
    var metric199: js.UndefOr[String | Double] = js.native
    
    var metric2: js.UndefOr[String | Double] = js.native
    
    var metric20: js.UndefOr[String | Double] = js.native
    
    var metric200: js.UndefOr[String | Double] = js.native
    
    var metric21: js.UndefOr[String | Double] = js.native
    
    var metric22: js.UndefOr[String | Double] = js.native
    
    var metric23: js.UndefOr[String | Double] = js.native
    
    var metric24: js.UndefOr[String | Double] = js.native
    
    var metric25: js.UndefOr[String | Double] = js.native
    
    var metric26: js.UndefOr[String | Double] = js.native
    
    var metric27: js.UndefOr[String | Double] = js.native
    
    var metric28: js.UndefOr[String | Double] = js.native
    
    var metric29: js.UndefOr[String | Double] = js.native
    
    var metric3: js.UndefOr[String | Double] = js.native
    
    var metric30: js.UndefOr[String | Double] = js.native
    
    var metric31: js.UndefOr[String | Double] = js.native
    
    var metric32: js.UndefOr[String | Double] = js.native
    
    var metric33: js.UndefOr[String | Double] = js.native
    
    var metric34: js.UndefOr[String | Double] = js.native
    
    var metric35: js.UndefOr[String | Double] = js.native
    
    var metric36: js.UndefOr[String | Double] = js.native
    
    var metric37: js.UndefOr[String | Double] = js.native
    
    var metric38: js.UndefOr[String | Double] = js.native
    
    var metric39: js.UndefOr[String | Double] = js.native
    
    var metric4: js.UndefOr[String | Double] = js.native
    
    var metric40: js.UndefOr[String | Double] = js.native
    
    var metric41: js.UndefOr[String | Double] = js.native
    
    var metric42: js.UndefOr[String | Double] = js.native
    
    var metric43: js.UndefOr[String | Double] = js.native
    
    var metric44: js.UndefOr[String | Double] = js.native
    
    var metric45: js.UndefOr[String | Double] = js.native
    
    var metric46: js.UndefOr[String | Double] = js.native
    
    var metric47: js.UndefOr[String | Double] = js.native
    
    var metric48: js.UndefOr[String | Double] = js.native
    
    var metric49: js.UndefOr[String | Double] = js.native
    
    var metric5: js.UndefOr[String | Double] = js.native
    
    var metric50: js.UndefOr[String | Double] = js.native
    
    var metric51: js.UndefOr[String | Double] = js.native
    
    var metric52: js.UndefOr[String | Double] = js.native
    
    var metric53: js.UndefOr[String | Double] = js.native
    
    var metric54: js.UndefOr[String | Double] = js.native
    
    var metric55: js.UndefOr[String | Double] = js.native
    
    var metric56: js.UndefOr[String | Double] = js.native
    
    var metric57: js.UndefOr[String | Double] = js.native
    
    var metric58: js.UndefOr[String | Double] = js.native
    
    var metric59: js.UndefOr[String | Double] = js.native
    
    var metric6: js.UndefOr[String | Double] = js.native
    
    var metric60: js.UndefOr[String | Double] = js.native
    
    var metric61: js.UndefOr[String | Double] = js.native
    
    var metric62: js.UndefOr[String | Double] = js.native
    
    var metric63: js.UndefOr[String | Double] = js.native
    
    var metric64: js.UndefOr[String | Double] = js.native
    
    var metric65: js.UndefOr[String | Double] = js.native
    
    var metric66: js.UndefOr[String | Double] = js.native
    
    var metric67: js.UndefOr[String | Double] = js.native
    
    var metric68: js.UndefOr[String | Double] = js.native
    
    var metric69: js.UndefOr[String | Double] = js.native
    
    var metric7: js.UndefOr[String | Double] = js.native
    
    var metric70: js.UndefOr[String | Double] = js.native
    
    var metric71: js.UndefOr[String | Double] = js.native
    
    var metric72: js.UndefOr[String | Double] = js.native
    
    var metric73: js.UndefOr[String | Double] = js.native
    
    var metric74: js.UndefOr[String | Double] = js.native
    
    var metric75: js.UndefOr[String | Double] = js.native
    
    var metric76: js.UndefOr[String | Double] = js.native
    
    var metric77: js.UndefOr[String | Double] = js.native
    
    var metric78: js.UndefOr[String | Double] = js.native
    
    var metric79: js.UndefOr[String | Double] = js.native
    
    var metric8: js.UndefOr[String | Double] = js.native
    
    var metric80: js.UndefOr[String | Double] = js.native
    
    var metric81: js.UndefOr[String | Double] = js.native
    
    var metric82: js.UndefOr[String | Double] = js.native
    
    var metric83: js.UndefOr[String | Double] = js.native
    
    var metric84: js.UndefOr[String | Double] = js.native
    
    var metric85: js.UndefOr[String | Double] = js.native
    
    var metric86: js.UndefOr[String | Double] = js.native
    
    var metric87: js.UndefOr[String | Double] = js.native
    
    var metric88: js.UndefOr[String | Double] = js.native
    
    var metric89: js.UndefOr[String | Double] = js.native
    
    var metric9: js.UndefOr[String | Double] = js.native
    
    var metric90: js.UndefOr[String | Double] = js.native
    
    var metric91: js.UndefOr[String | Double] = js.native
    
    var metric92: js.UndefOr[String | Double] = js.native
    
    var metric93: js.UndefOr[String | Double] = js.native
    
    var metric94: js.UndefOr[String | Double] = js.native
    
    var metric95: js.UndefOr[String | Double] = js.native
    
    var metric96: js.UndefOr[String | Double] = js.native
    
    var metric97: js.UndefOr[String | Double] = js.native
    
    var metric98: js.UndefOr[String | Double] = js.native
    
    var metric99: js.UndefOr[String | Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nonInteraction: js.UndefOr[Boolean] = js.native
    
    var option: js.UndefOr[String] = js.native
    
    var page: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[Double | String] = js.native
    
    var price: js.UndefOr[String] = js.native
    
    var quantity: js.UndefOr[Double] = js.native
    
    var queueTime: js.UndefOr[Double] = js.native
    
    var referrer: js.UndefOr[String] = js.native
    
    var revenue: js.UndefOr[String] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
    
    var screenColors: js.UndefOr[String] = js.native
    
    var screenName: js.UndefOr[String] = js.native
    
    var screenResolution: js.UndefOr[String] = js.native
    
    var sessionControl: js.UndefOr[String] = js.native
    
    var shipping: js.UndefOr[String] = js.native
    
    var siteSpeedSampleRate: js.UndefOr[Double] = js.native
    
    var socialAction: js.UndefOr[String] = js.native
    
    var socialNetwork: js.UndefOr[String] = js.native
    
    var socialTarget: js.UndefOr[String] = js.native
    
    var some: js.UndefOr[String] = js.native
    
    var step: js.UndefOr[Boolean | Double] = js.native
    
    var storage: js.UndefOr[String] = js.native
    
    var storeGac: js.UndefOr[Boolean] = js.native
    
    var tax: js.UndefOr[String] = js.native
    
    var timingCategory: js.UndefOr[String] = js.native
    
    var timingLabel: js.UndefOr[String] = js.native
    
    var timingValue: js.UndefOr[Double] = js.native
    
    var timingVar: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var transport: js.UndefOr[String] = js.native
    
    var useBeacon: js.UndefOr[Boolean] = js.native
    
    var userId: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
    
    var viewportSize: js.UndefOr[String] = js.native
  }
  object FieldsObject {
    
    @scala.inline
    def apply(): FieldsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsObject]
    }
    
    @scala.inline
    implicit class FieldsObjectMutableBuilder[Self <: FieldsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      @scala.inline
      def setAllowAnchor(value: Boolean): Self = StObject.set(x, "allowAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAnchorUndefined: Self = StObject.set(x, "allowAnchor", js.undefined)
      
      @scala.inline
      def setAllowLinker(value: Boolean): Self = StObject.set(x, "allowLinker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLinkerUndefined: Self = StObject.set(x, "allowLinker", js.undefined)
      
      @scala.inline
      def setAlwaysSendReferrer(value: Boolean): Self = StObject.set(x, "alwaysSendReferrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysSendReferrerUndefined: Self = StObject.set(x, "alwaysSendReferrer", js.undefined)
      
      @scala.inline
      def setAnonymizeIp(value: Boolean): Self = StObject.set(x, "anonymizeIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymizeIpUndefined: Self = StObject.set(x, "anonymizeIp", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAppInstallerId(value: String): Self = StObject.set(x, "appInstallerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppInstallerIdUndefined: Self = StObject.set(x, "appInstallerId", js.undefined)
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setCampaignContent(value: String): Self = StObject.set(x, "campaignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignContentUndefined: Self = StObject.set(x, "campaignContent", js.undefined)
      
      @scala.inline
      def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
      
      @scala.inline
      def setCampaignKeyword(value: String): Self = StObject.set(x, "campaignKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignKeywordUndefined: Self = StObject.set(x, "campaignKeyword", js.undefined)
      
      @scala.inline
      def setCampaignMedium(value: String): Self = StObject.set(x, "campaignMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignMediumUndefined: Self = StObject.set(x, "campaignMedium", js.undefined)
      
      @scala.inline
      def setCampaignName(value: String): Self = StObject.set(x, "campaignName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignNameUndefined: Self = StObject.set(x, "campaignName", js.undefined)
      
      @scala.inline
      def setCampaignSource(value: String): Self = StObject.set(x, "campaignSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignSourceUndefined: Self = StObject.set(x, "campaignSource", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setContentGroup1(value: String): Self = StObject.set(x, "contentGroup1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup10(value: String): Self = StObject.set(x, "contentGroup10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup10Undefined: Self = StObject.set(x, "contentGroup10", js.undefined)
      
      @scala.inline
      def setContentGroup1Undefined: Self = StObject.set(x, "contentGroup1", js.undefined)
      
      @scala.inline
      def setContentGroup2(value: String): Self = StObject.set(x, "contentGroup2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup2Undefined: Self = StObject.set(x, "contentGroup2", js.undefined)
      
      @scala.inline
      def setContentGroup3(value: String): Self = StObject.set(x, "contentGroup3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup3Undefined: Self = StObject.set(x, "contentGroup3", js.undefined)
      
      @scala.inline
      def setContentGroup4(value: String): Self = StObject.set(x, "contentGroup4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup4Undefined: Self = StObject.set(x, "contentGroup4", js.undefined)
      
      @scala.inline
      def setContentGroup5(value: String): Self = StObject.set(x, "contentGroup5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup5Undefined: Self = StObject.set(x, "contentGroup5", js.undefined)
      
      @scala.inline
      def setContentGroup6(value: String): Self = StObject.set(x, "contentGroup6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup6Undefined: Self = StObject.set(x, "contentGroup6", js.undefined)
      
      @scala.inline
      def setContentGroup7(value: String): Self = StObject.set(x, "contentGroup7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup7Undefined: Self = StObject.set(x, "contentGroup7", js.undefined)
      
      @scala.inline
      def setContentGroup8(value: String): Self = StObject.set(x, "contentGroup8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup8Undefined: Self = StObject.set(x, "contentGroup8", js.undefined)
      
      @scala.inline
      def setContentGroup9(value: String): Self = StObject.set(x, "contentGroup9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentGroup9Undefined: Self = StObject.set(x, "contentGroup9", js.undefined)
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieExpires(value: Double): Self = StObject.set(x, "cookieExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpiresUndefined: Self = StObject.set(x, "cookieExpires", js.undefined)
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      @scala.inline
      def setCookiePath(value: String): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setCreative(value: String): Self = StObject.set(x, "creative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreativeUndefined: Self = StObject.set(x, "creative", js.undefined)
      
      @scala.inline
      def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
      
      @scala.inline
      def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDimension1(value: String): Self = StObject.set(x, "dimension1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension10(value: String): Self = StObject.set(x, "dimension10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension100(value: String): Self = StObject.set(x, "dimension100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension100Undefined: Self = StObject.set(x, "dimension100", js.undefined)
      
      @scala.inline
      def setDimension101(value: String): Self = StObject.set(x, "dimension101", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension101Undefined: Self = StObject.set(x, "dimension101", js.undefined)
      
      @scala.inline
      def setDimension102(value: String): Self = StObject.set(x, "dimension102", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension102Undefined: Self = StObject.set(x, "dimension102", js.undefined)
      
      @scala.inline
      def setDimension103(value: String): Self = StObject.set(x, "dimension103", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension103Undefined: Self = StObject.set(x, "dimension103", js.undefined)
      
      @scala.inline
      def setDimension104(value: String): Self = StObject.set(x, "dimension104", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension104Undefined: Self = StObject.set(x, "dimension104", js.undefined)
      
      @scala.inline
      def setDimension105(value: String): Self = StObject.set(x, "dimension105", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension105Undefined: Self = StObject.set(x, "dimension105", js.undefined)
      
      @scala.inline
      def setDimension106(value: String): Self = StObject.set(x, "dimension106", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension106Undefined: Self = StObject.set(x, "dimension106", js.undefined)
      
      @scala.inline
      def setDimension107(value: String): Self = StObject.set(x, "dimension107", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension107Undefined: Self = StObject.set(x, "dimension107", js.undefined)
      
      @scala.inline
      def setDimension108(value: String): Self = StObject.set(x, "dimension108", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension108Undefined: Self = StObject.set(x, "dimension108", js.undefined)
      
      @scala.inline
      def setDimension109(value: String): Self = StObject.set(x, "dimension109", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension109Undefined: Self = StObject.set(x, "dimension109", js.undefined)
      
      @scala.inline
      def setDimension10Undefined: Self = StObject.set(x, "dimension10", js.undefined)
      
      @scala.inline
      def setDimension11(value: String): Self = StObject.set(x, "dimension11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension110(value: String): Self = StObject.set(x, "dimension110", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension110Undefined: Self = StObject.set(x, "dimension110", js.undefined)
      
      @scala.inline
      def setDimension111(value: String): Self = StObject.set(x, "dimension111", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension111Undefined: Self = StObject.set(x, "dimension111", js.undefined)
      
      @scala.inline
      def setDimension112(value: String): Self = StObject.set(x, "dimension112", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension112Undefined: Self = StObject.set(x, "dimension112", js.undefined)
      
      @scala.inline
      def setDimension113(value: String): Self = StObject.set(x, "dimension113", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension113Undefined: Self = StObject.set(x, "dimension113", js.undefined)
      
      @scala.inline
      def setDimension114(value: String): Self = StObject.set(x, "dimension114", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension114Undefined: Self = StObject.set(x, "dimension114", js.undefined)
      
      @scala.inline
      def setDimension115(value: String): Self = StObject.set(x, "dimension115", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension115Undefined: Self = StObject.set(x, "dimension115", js.undefined)
      
      @scala.inline
      def setDimension116(value: String): Self = StObject.set(x, "dimension116", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension116Undefined: Self = StObject.set(x, "dimension116", js.undefined)
      
      @scala.inline
      def setDimension117(value: String): Self = StObject.set(x, "dimension117", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension117Undefined: Self = StObject.set(x, "dimension117", js.undefined)
      
      @scala.inline
      def setDimension118(value: String): Self = StObject.set(x, "dimension118", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension118Undefined: Self = StObject.set(x, "dimension118", js.undefined)
      
      @scala.inline
      def setDimension119(value: String): Self = StObject.set(x, "dimension119", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension119Undefined: Self = StObject.set(x, "dimension119", js.undefined)
      
      @scala.inline
      def setDimension11Undefined: Self = StObject.set(x, "dimension11", js.undefined)
      
      @scala.inline
      def setDimension12(value: String): Self = StObject.set(x, "dimension12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension120(value: String): Self = StObject.set(x, "dimension120", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension120Undefined: Self = StObject.set(x, "dimension120", js.undefined)
      
      @scala.inline
      def setDimension121(value: String): Self = StObject.set(x, "dimension121", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension121Undefined: Self = StObject.set(x, "dimension121", js.undefined)
      
      @scala.inline
      def setDimension122(value: String): Self = StObject.set(x, "dimension122", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension122Undefined: Self = StObject.set(x, "dimension122", js.undefined)
      
      @scala.inline
      def setDimension123(value: String): Self = StObject.set(x, "dimension123", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension123Undefined: Self = StObject.set(x, "dimension123", js.undefined)
      
      @scala.inline
      def setDimension124(value: String): Self = StObject.set(x, "dimension124", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension124Undefined: Self = StObject.set(x, "dimension124", js.undefined)
      
      @scala.inline
      def setDimension125(value: String): Self = StObject.set(x, "dimension125", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension125Undefined: Self = StObject.set(x, "dimension125", js.undefined)
      
      @scala.inline
      def setDimension126(value: String): Self = StObject.set(x, "dimension126", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension126Undefined: Self = StObject.set(x, "dimension126", js.undefined)
      
      @scala.inline
      def setDimension127(value: String): Self = StObject.set(x, "dimension127", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension127Undefined: Self = StObject.set(x, "dimension127", js.undefined)
      
      @scala.inline
      def setDimension128(value: String): Self = StObject.set(x, "dimension128", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension128Undefined: Self = StObject.set(x, "dimension128", js.undefined)
      
      @scala.inline
      def setDimension129(value: String): Self = StObject.set(x, "dimension129", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension129Undefined: Self = StObject.set(x, "dimension129", js.undefined)
      
      @scala.inline
      def setDimension12Undefined: Self = StObject.set(x, "dimension12", js.undefined)
      
      @scala.inline
      def setDimension13(value: String): Self = StObject.set(x, "dimension13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension130(value: String): Self = StObject.set(x, "dimension130", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension130Undefined: Self = StObject.set(x, "dimension130", js.undefined)
      
      @scala.inline
      def setDimension131(value: String): Self = StObject.set(x, "dimension131", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension131Undefined: Self = StObject.set(x, "dimension131", js.undefined)
      
      @scala.inline
      def setDimension132(value: String): Self = StObject.set(x, "dimension132", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension132Undefined: Self = StObject.set(x, "dimension132", js.undefined)
      
      @scala.inline
      def setDimension133(value: String): Self = StObject.set(x, "dimension133", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension133Undefined: Self = StObject.set(x, "dimension133", js.undefined)
      
      @scala.inline
      def setDimension134(value: String): Self = StObject.set(x, "dimension134", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension134Undefined: Self = StObject.set(x, "dimension134", js.undefined)
      
      @scala.inline
      def setDimension135(value: String): Self = StObject.set(x, "dimension135", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension135Undefined: Self = StObject.set(x, "dimension135", js.undefined)
      
      @scala.inline
      def setDimension136(value: String): Self = StObject.set(x, "dimension136", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension136Undefined: Self = StObject.set(x, "dimension136", js.undefined)
      
      @scala.inline
      def setDimension137(value: String): Self = StObject.set(x, "dimension137", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension137Undefined: Self = StObject.set(x, "dimension137", js.undefined)
      
      @scala.inline
      def setDimension138(value: String): Self = StObject.set(x, "dimension138", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension138Undefined: Self = StObject.set(x, "dimension138", js.undefined)
      
      @scala.inline
      def setDimension139(value: String): Self = StObject.set(x, "dimension139", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension139Undefined: Self = StObject.set(x, "dimension139", js.undefined)
      
      @scala.inline
      def setDimension13Undefined: Self = StObject.set(x, "dimension13", js.undefined)
      
      @scala.inline
      def setDimension14(value: String): Self = StObject.set(x, "dimension14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension140(value: String): Self = StObject.set(x, "dimension140", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension140Undefined: Self = StObject.set(x, "dimension140", js.undefined)
      
      @scala.inline
      def setDimension141(value: String): Self = StObject.set(x, "dimension141", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension141Undefined: Self = StObject.set(x, "dimension141", js.undefined)
      
      @scala.inline
      def setDimension142(value: String): Self = StObject.set(x, "dimension142", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension142Undefined: Self = StObject.set(x, "dimension142", js.undefined)
      
      @scala.inline
      def setDimension143(value: String): Self = StObject.set(x, "dimension143", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension143Undefined: Self = StObject.set(x, "dimension143", js.undefined)
      
      @scala.inline
      def setDimension144(value: String): Self = StObject.set(x, "dimension144", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension144Undefined: Self = StObject.set(x, "dimension144", js.undefined)
      
      @scala.inline
      def setDimension145(value: String): Self = StObject.set(x, "dimension145", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension145Undefined: Self = StObject.set(x, "dimension145", js.undefined)
      
      @scala.inline
      def setDimension146(value: String): Self = StObject.set(x, "dimension146", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension146Undefined: Self = StObject.set(x, "dimension146", js.undefined)
      
      @scala.inline
      def setDimension147(value: String): Self = StObject.set(x, "dimension147", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension147Undefined: Self = StObject.set(x, "dimension147", js.undefined)
      
      @scala.inline
      def setDimension148(value: String): Self = StObject.set(x, "dimension148", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension148Undefined: Self = StObject.set(x, "dimension148", js.undefined)
      
      @scala.inline
      def setDimension149(value: String): Self = StObject.set(x, "dimension149", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension149Undefined: Self = StObject.set(x, "dimension149", js.undefined)
      
      @scala.inline
      def setDimension14Undefined: Self = StObject.set(x, "dimension14", js.undefined)
      
      @scala.inline
      def setDimension15(value: String): Self = StObject.set(x, "dimension15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension150(value: String): Self = StObject.set(x, "dimension150", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension150Undefined: Self = StObject.set(x, "dimension150", js.undefined)
      
      @scala.inline
      def setDimension151(value: String): Self = StObject.set(x, "dimension151", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension151Undefined: Self = StObject.set(x, "dimension151", js.undefined)
      
      @scala.inline
      def setDimension152(value: String): Self = StObject.set(x, "dimension152", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension152Undefined: Self = StObject.set(x, "dimension152", js.undefined)
      
      @scala.inline
      def setDimension153(value: String): Self = StObject.set(x, "dimension153", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension153Undefined: Self = StObject.set(x, "dimension153", js.undefined)
      
      @scala.inline
      def setDimension154(value: String): Self = StObject.set(x, "dimension154", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension154Undefined: Self = StObject.set(x, "dimension154", js.undefined)
      
      @scala.inline
      def setDimension155(value: String): Self = StObject.set(x, "dimension155", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension155Undefined: Self = StObject.set(x, "dimension155", js.undefined)
      
      @scala.inline
      def setDimension156(value: String): Self = StObject.set(x, "dimension156", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension156Undefined: Self = StObject.set(x, "dimension156", js.undefined)
      
      @scala.inline
      def setDimension157(value: String): Self = StObject.set(x, "dimension157", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension157Undefined: Self = StObject.set(x, "dimension157", js.undefined)
      
      @scala.inline
      def setDimension158(value: String): Self = StObject.set(x, "dimension158", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension158Undefined: Self = StObject.set(x, "dimension158", js.undefined)
      
      @scala.inline
      def setDimension159(value: String): Self = StObject.set(x, "dimension159", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension159Undefined: Self = StObject.set(x, "dimension159", js.undefined)
      
      @scala.inline
      def setDimension15Undefined: Self = StObject.set(x, "dimension15", js.undefined)
      
      @scala.inline
      def setDimension16(value: String): Self = StObject.set(x, "dimension16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension160(value: String): Self = StObject.set(x, "dimension160", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension160Undefined: Self = StObject.set(x, "dimension160", js.undefined)
      
      @scala.inline
      def setDimension161(value: String): Self = StObject.set(x, "dimension161", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension161Undefined: Self = StObject.set(x, "dimension161", js.undefined)
      
      @scala.inline
      def setDimension162(value: String): Self = StObject.set(x, "dimension162", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension162Undefined: Self = StObject.set(x, "dimension162", js.undefined)
      
      @scala.inline
      def setDimension163(value: String): Self = StObject.set(x, "dimension163", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension163Undefined: Self = StObject.set(x, "dimension163", js.undefined)
      
      @scala.inline
      def setDimension164(value: String): Self = StObject.set(x, "dimension164", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension164Undefined: Self = StObject.set(x, "dimension164", js.undefined)
      
      @scala.inline
      def setDimension165(value: String): Self = StObject.set(x, "dimension165", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension165Undefined: Self = StObject.set(x, "dimension165", js.undefined)
      
      @scala.inline
      def setDimension166(value: String): Self = StObject.set(x, "dimension166", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension166Undefined: Self = StObject.set(x, "dimension166", js.undefined)
      
      @scala.inline
      def setDimension167(value: String): Self = StObject.set(x, "dimension167", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension167Undefined: Self = StObject.set(x, "dimension167", js.undefined)
      
      @scala.inline
      def setDimension168(value: String): Self = StObject.set(x, "dimension168", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension168Undefined: Self = StObject.set(x, "dimension168", js.undefined)
      
      @scala.inline
      def setDimension169(value: String): Self = StObject.set(x, "dimension169", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension169Undefined: Self = StObject.set(x, "dimension169", js.undefined)
      
      @scala.inline
      def setDimension16Undefined: Self = StObject.set(x, "dimension16", js.undefined)
      
      @scala.inline
      def setDimension17(value: String): Self = StObject.set(x, "dimension17", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension170(value: String): Self = StObject.set(x, "dimension170", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension170Undefined: Self = StObject.set(x, "dimension170", js.undefined)
      
      @scala.inline
      def setDimension171(value: String): Self = StObject.set(x, "dimension171", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension171Undefined: Self = StObject.set(x, "dimension171", js.undefined)
      
      @scala.inline
      def setDimension172(value: String): Self = StObject.set(x, "dimension172", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension172Undefined: Self = StObject.set(x, "dimension172", js.undefined)
      
      @scala.inline
      def setDimension173(value: String): Self = StObject.set(x, "dimension173", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension173Undefined: Self = StObject.set(x, "dimension173", js.undefined)
      
      @scala.inline
      def setDimension174(value: String): Self = StObject.set(x, "dimension174", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension174Undefined: Self = StObject.set(x, "dimension174", js.undefined)
      
      @scala.inline
      def setDimension175(value: String): Self = StObject.set(x, "dimension175", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension175Undefined: Self = StObject.set(x, "dimension175", js.undefined)
      
      @scala.inline
      def setDimension176(value: String): Self = StObject.set(x, "dimension176", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension176Undefined: Self = StObject.set(x, "dimension176", js.undefined)
      
      @scala.inline
      def setDimension177(value: String): Self = StObject.set(x, "dimension177", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension177Undefined: Self = StObject.set(x, "dimension177", js.undefined)
      
      @scala.inline
      def setDimension178(value: String): Self = StObject.set(x, "dimension178", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension178Undefined: Self = StObject.set(x, "dimension178", js.undefined)
      
      @scala.inline
      def setDimension179(value: String): Self = StObject.set(x, "dimension179", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension179Undefined: Self = StObject.set(x, "dimension179", js.undefined)
      
      @scala.inline
      def setDimension17Undefined: Self = StObject.set(x, "dimension17", js.undefined)
      
      @scala.inline
      def setDimension18(value: String): Self = StObject.set(x, "dimension18", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension180(value: String): Self = StObject.set(x, "dimension180", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension180Undefined: Self = StObject.set(x, "dimension180", js.undefined)
      
      @scala.inline
      def setDimension181(value: String): Self = StObject.set(x, "dimension181", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension181Undefined: Self = StObject.set(x, "dimension181", js.undefined)
      
      @scala.inline
      def setDimension182(value: String): Self = StObject.set(x, "dimension182", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension182Undefined: Self = StObject.set(x, "dimension182", js.undefined)
      
      @scala.inline
      def setDimension183(value: String): Self = StObject.set(x, "dimension183", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension183Undefined: Self = StObject.set(x, "dimension183", js.undefined)
      
      @scala.inline
      def setDimension184(value: String): Self = StObject.set(x, "dimension184", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension184Undefined: Self = StObject.set(x, "dimension184", js.undefined)
      
      @scala.inline
      def setDimension185(value: String): Self = StObject.set(x, "dimension185", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension185Undefined: Self = StObject.set(x, "dimension185", js.undefined)
      
      @scala.inline
      def setDimension186(value: String): Self = StObject.set(x, "dimension186", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension186Undefined: Self = StObject.set(x, "dimension186", js.undefined)
      
      @scala.inline
      def setDimension187(value: String): Self = StObject.set(x, "dimension187", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension187Undefined: Self = StObject.set(x, "dimension187", js.undefined)
      
      @scala.inline
      def setDimension188(value: String): Self = StObject.set(x, "dimension188", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension188Undefined: Self = StObject.set(x, "dimension188", js.undefined)
      
      @scala.inline
      def setDimension189(value: String): Self = StObject.set(x, "dimension189", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension189Undefined: Self = StObject.set(x, "dimension189", js.undefined)
      
      @scala.inline
      def setDimension18Undefined: Self = StObject.set(x, "dimension18", js.undefined)
      
      @scala.inline
      def setDimension19(value: String): Self = StObject.set(x, "dimension19", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension190(value: String): Self = StObject.set(x, "dimension190", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension190Undefined: Self = StObject.set(x, "dimension190", js.undefined)
      
      @scala.inline
      def setDimension191(value: String): Self = StObject.set(x, "dimension191", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension191Undefined: Self = StObject.set(x, "dimension191", js.undefined)
      
      @scala.inline
      def setDimension192(value: String): Self = StObject.set(x, "dimension192", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension192Undefined: Self = StObject.set(x, "dimension192", js.undefined)
      
      @scala.inline
      def setDimension193(value: String): Self = StObject.set(x, "dimension193", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension193Undefined: Self = StObject.set(x, "dimension193", js.undefined)
      
      @scala.inline
      def setDimension194(value: String): Self = StObject.set(x, "dimension194", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension194Undefined: Self = StObject.set(x, "dimension194", js.undefined)
      
      @scala.inline
      def setDimension195(value: String): Self = StObject.set(x, "dimension195", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension195Undefined: Self = StObject.set(x, "dimension195", js.undefined)
      
      @scala.inline
      def setDimension196(value: String): Self = StObject.set(x, "dimension196", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension196Undefined: Self = StObject.set(x, "dimension196", js.undefined)
      
      @scala.inline
      def setDimension197(value: String): Self = StObject.set(x, "dimension197", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension197Undefined: Self = StObject.set(x, "dimension197", js.undefined)
      
      @scala.inline
      def setDimension198(value: String): Self = StObject.set(x, "dimension198", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension198Undefined: Self = StObject.set(x, "dimension198", js.undefined)
      
      @scala.inline
      def setDimension199(value: String): Self = StObject.set(x, "dimension199", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension199Undefined: Self = StObject.set(x, "dimension199", js.undefined)
      
      @scala.inline
      def setDimension19Undefined: Self = StObject.set(x, "dimension19", js.undefined)
      
      @scala.inline
      def setDimension1Undefined: Self = StObject.set(x, "dimension1", js.undefined)
      
      @scala.inline
      def setDimension2(value: String): Self = StObject.set(x, "dimension2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension20(value: String): Self = StObject.set(x, "dimension20", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension200(value: String): Self = StObject.set(x, "dimension200", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension200Undefined: Self = StObject.set(x, "dimension200", js.undefined)
      
      @scala.inline
      def setDimension20Undefined: Self = StObject.set(x, "dimension20", js.undefined)
      
      @scala.inline
      def setDimension21(value: String): Self = StObject.set(x, "dimension21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension21Undefined: Self = StObject.set(x, "dimension21", js.undefined)
      
      @scala.inline
      def setDimension22(value: String): Self = StObject.set(x, "dimension22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension22Undefined: Self = StObject.set(x, "dimension22", js.undefined)
      
      @scala.inline
      def setDimension23(value: String): Self = StObject.set(x, "dimension23", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension23Undefined: Self = StObject.set(x, "dimension23", js.undefined)
      
      @scala.inline
      def setDimension24(value: String): Self = StObject.set(x, "dimension24", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension24Undefined: Self = StObject.set(x, "dimension24", js.undefined)
      
      @scala.inline
      def setDimension25(value: String): Self = StObject.set(x, "dimension25", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension25Undefined: Self = StObject.set(x, "dimension25", js.undefined)
      
      @scala.inline
      def setDimension26(value: String): Self = StObject.set(x, "dimension26", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension26Undefined: Self = StObject.set(x, "dimension26", js.undefined)
      
      @scala.inline
      def setDimension27(value: String): Self = StObject.set(x, "dimension27", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension27Undefined: Self = StObject.set(x, "dimension27", js.undefined)
      
      @scala.inline
      def setDimension28(value: String): Self = StObject.set(x, "dimension28", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension28Undefined: Self = StObject.set(x, "dimension28", js.undefined)
      
      @scala.inline
      def setDimension29(value: String): Self = StObject.set(x, "dimension29", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension29Undefined: Self = StObject.set(x, "dimension29", js.undefined)
      
      @scala.inline
      def setDimension2Undefined: Self = StObject.set(x, "dimension2", js.undefined)
      
      @scala.inline
      def setDimension3(value: String): Self = StObject.set(x, "dimension3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension30(value: String): Self = StObject.set(x, "dimension30", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension30Undefined: Self = StObject.set(x, "dimension30", js.undefined)
      
      @scala.inline
      def setDimension31(value: String): Self = StObject.set(x, "dimension31", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension31Undefined: Self = StObject.set(x, "dimension31", js.undefined)
      
      @scala.inline
      def setDimension32(value: String): Self = StObject.set(x, "dimension32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension32Undefined: Self = StObject.set(x, "dimension32", js.undefined)
      
      @scala.inline
      def setDimension33(value: String): Self = StObject.set(x, "dimension33", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension33Undefined: Self = StObject.set(x, "dimension33", js.undefined)
      
      @scala.inline
      def setDimension34(value: String): Self = StObject.set(x, "dimension34", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension34Undefined: Self = StObject.set(x, "dimension34", js.undefined)
      
      @scala.inline
      def setDimension35(value: String): Self = StObject.set(x, "dimension35", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension35Undefined: Self = StObject.set(x, "dimension35", js.undefined)
      
      @scala.inline
      def setDimension36(value: String): Self = StObject.set(x, "dimension36", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension36Undefined: Self = StObject.set(x, "dimension36", js.undefined)
      
      @scala.inline
      def setDimension37(value: String): Self = StObject.set(x, "dimension37", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension37Undefined: Self = StObject.set(x, "dimension37", js.undefined)
      
      @scala.inline
      def setDimension38(value: String): Self = StObject.set(x, "dimension38", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension38Undefined: Self = StObject.set(x, "dimension38", js.undefined)
      
      @scala.inline
      def setDimension39(value: String): Self = StObject.set(x, "dimension39", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension39Undefined: Self = StObject.set(x, "dimension39", js.undefined)
      
      @scala.inline
      def setDimension3Undefined: Self = StObject.set(x, "dimension3", js.undefined)
      
      @scala.inline
      def setDimension4(value: String): Self = StObject.set(x, "dimension4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension40(value: String): Self = StObject.set(x, "dimension40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension40Undefined: Self = StObject.set(x, "dimension40", js.undefined)
      
      @scala.inline
      def setDimension41(value: String): Self = StObject.set(x, "dimension41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension41Undefined: Self = StObject.set(x, "dimension41", js.undefined)
      
      @scala.inline
      def setDimension42(value: String): Self = StObject.set(x, "dimension42", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension42Undefined: Self = StObject.set(x, "dimension42", js.undefined)
      
      @scala.inline
      def setDimension43(value: String): Self = StObject.set(x, "dimension43", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension43Undefined: Self = StObject.set(x, "dimension43", js.undefined)
      
      @scala.inline
      def setDimension44(value: String): Self = StObject.set(x, "dimension44", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension44Undefined: Self = StObject.set(x, "dimension44", js.undefined)
      
      @scala.inline
      def setDimension45(value: String): Self = StObject.set(x, "dimension45", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension45Undefined: Self = StObject.set(x, "dimension45", js.undefined)
      
      @scala.inline
      def setDimension46(value: String): Self = StObject.set(x, "dimension46", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension46Undefined: Self = StObject.set(x, "dimension46", js.undefined)
      
      @scala.inline
      def setDimension47(value: String): Self = StObject.set(x, "dimension47", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension47Undefined: Self = StObject.set(x, "dimension47", js.undefined)
      
      @scala.inline
      def setDimension48(value: String): Self = StObject.set(x, "dimension48", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension48Undefined: Self = StObject.set(x, "dimension48", js.undefined)
      
      @scala.inline
      def setDimension49(value: String): Self = StObject.set(x, "dimension49", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension49Undefined: Self = StObject.set(x, "dimension49", js.undefined)
      
      @scala.inline
      def setDimension4Undefined: Self = StObject.set(x, "dimension4", js.undefined)
      
      @scala.inline
      def setDimension5(value: String): Self = StObject.set(x, "dimension5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension50(value: String): Self = StObject.set(x, "dimension50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension50Undefined: Self = StObject.set(x, "dimension50", js.undefined)
      
      @scala.inline
      def setDimension51(value: String): Self = StObject.set(x, "dimension51", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension51Undefined: Self = StObject.set(x, "dimension51", js.undefined)
      
      @scala.inline
      def setDimension52(value: String): Self = StObject.set(x, "dimension52", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension52Undefined: Self = StObject.set(x, "dimension52", js.undefined)
      
      @scala.inline
      def setDimension53(value: String): Self = StObject.set(x, "dimension53", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension53Undefined: Self = StObject.set(x, "dimension53", js.undefined)
      
      @scala.inline
      def setDimension54(value: String): Self = StObject.set(x, "dimension54", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension54Undefined: Self = StObject.set(x, "dimension54", js.undefined)
      
      @scala.inline
      def setDimension55(value: String): Self = StObject.set(x, "dimension55", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension55Undefined: Self = StObject.set(x, "dimension55", js.undefined)
      
      @scala.inline
      def setDimension56(value: String): Self = StObject.set(x, "dimension56", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension56Undefined: Self = StObject.set(x, "dimension56", js.undefined)
      
      @scala.inline
      def setDimension57(value: String): Self = StObject.set(x, "dimension57", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension57Undefined: Self = StObject.set(x, "dimension57", js.undefined)
      
      @scala.inline
      def setDimension58(value: String): Self = StObject.set(x, "dimension58", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension58Undefined: Self = StObject.set(x, "dimension58", js.undefined)
      
      @scala.inline
      def setDimension59(value: String): Self = StObject.set(x, "dimension59", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension59Undefined: Self = StObject.set(x, "dimension59", js.undefined)
      
      @scala.inline
      def setDimension5Undefined: Self = StObject.set(x, "dimension5", js.undefined)
      
      @scala.inline
      def setDimension6(value: String): Self = StObject.set(x, "dimension6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension60(value: String): Self = StObject.set(x, "dimension60", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension60Undefined: Self = StObject.set(x, "dimension60", js.undefined)
      
      @scala.inline
      def setDimension61(value: String): Self = StObject.set(x, "dimension61", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension61Undefined: Self = StObject.set(x, "dimension61", js.undefined)
      
      @scala.inline
      def setDimension62(value: String): Self = StObject.set(x, "dimension62", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension62Undefined: Self = StObject.set(x, "dimension62", js.undefined)
      
      @scala.inline
      def setDimension63(value: String): Self = StObject.set(x, "dimension63", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension63Undefined: Self = StObject.set(x, "dimension63", js.undefined)
      
      @scala.inline
      def setDimension64(value: String): Self = StObject.set(x, "dimension64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension64Undefined: Self = StObject.set(x, "dimension64", js.undefined)
      
      @scala.inline
      def setDimension65(value: String): Self = StObject.set(x, "dimension65", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension65Undefined: Self = StObject.set(x, "dimension65", js.undefined)
      
      @scala.inline
      def setDimension66(value: String): Self = StObject.set(x, "dimension66", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension66Undefined: Self = StObject.set(x, "dimension66", js.undefined)
      
      @scala.inline
      def setDimension67(value: String): Self = StObject.set(x, "dimension67", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension67Undefined: Self = StObject.set(x, "dimension67", js.undefined)
      
      @scala.inline
      def setDimension68(value: String): Self = StObject.set(x, "dimension68", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension68Undefined: Self = StObject.set(x, "dimension68", js.undefined)
      
      @scala.inline
      def setDimension69(value: String): Self = StObject.set(x, "dimension69", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension69Undefined: Self = StObject.set(x, "dimension69", js.undefined)
      
      @scala.inline
      def setDimension6Undefined: Self = StObject.set(x, "dimension6", js.undefined)
      
      @scala.inline
      def setDimension7(value: String): Self = StObject.set(x, "dimension7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension70(value: String): Self = StObject.set(x, "dimension70", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension70Undefined: Self = StObject.set(x, "dimension70", js.undefined)
      
      @scala.inline
      def setDimension71(value: String): Self = StObject.set(x, "dimension71", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension71Undefined: Self = StObject.set(x, "dimension71", js.undefined)
      
      @scala.inline
      def setDimension72(value: String): Self = StObject.set(x, "dimension72", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension72Undefined: Self = StObject.set(x, "dimension72", js.undefined)
      
      @scala.inline
      def setDimension73(value: String): Self = StObject.set(x, "dimension73", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension73Undefined: Self = StObject.set(x, "dimension73", js.undefined)
      
      @scala.inline
      def setDimension74(value: String): Self = StObject.set(x, "dimension74", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension74Undefined: Self = StObject.set(x, "dimension74", js.undefined)
      
      @scala.inline
      def setDimension75(value: String): Self = StObject.set(x, "dimension75", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension75Undefined: Self = StObject.set(x, "dimension75", js.undefined)
      
      @scala.inline
      def setDimension76(value: String): Self = StObject.set(x, "dimension76", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension76Undefined: Self = StObject.set(x, "dimension76", js.undefined)
      
      @scala.inline
      def setDimension77(value: String): Self = StObject.set(x, "dimension77", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension77Undefined: Self = StObject.set(x, "dimension77", js.undefined)
      
      @scala.inline
      def setDimension78(value: String): Self = StObject.set(x, "dimension78", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension78Undefined: Self = StObject.set(x, "dimension78", js.undefined)
      
      @scala.inline
      def setDimension79(value: String): Self = StObject.set(x, "dimension79", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension79Undefined: Self = StObject.set(x, "dimension79", js.undefined)
      
      @scala.inline
      def setDimension7Undefined: Self = StObject.set(x, "dimension7", js.undefined)
      
      @scala.inline
      def setDimension8(value: String): Self = StObject.set(x, "dimension8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension80(value: String): Self = StObject.set(x, "dimension80", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension80Undefined: Self = StObject.set(x, "dimension80", js.undefined)
      
      @scala.inline
      def setDimension81(value: String): Self = StObject.set(x, "dimension81", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension81Undefined: Self = StObject.set(x, "dimension81", js.undefined)
      
      @scala.inline
      def setDimension82(value: String): Self = StObject.set(x, "dimension82", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension82Undefined: Self = StObject.set(x, "dimension82", js.undefined)
      
      @scala.inline
      def setDimension83(value: String): Self = StObject.set(x, "dimension83", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension83Undefined: Self = StObject.set(x, "dimension83", js.undefined)
      
      @scala.inline
      def setDimension84(value: String): Self = StObject.set(x, "dimension84", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension84Undefined: Self = StObject.set(x, "dimension84", js.undefined)
      
      @scala.inline
      def setDimension85(value: String): Self = StObject.set(x, "dimension85", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension85Undefined: Self = StObject.set(x, "dimension85", js.undefined)
      
      @scala.inline
      def setDimension86(value: String): Self = StObject.set(x, "dimension86", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension86Undefined: Self = StObject.set(x, "dimension86", js.undefined)
      
      @scala.inline
      def setDimension87(value: String): Self = StObject.set(x, "dimension87", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension87Undefined: Self = StObject.set(x, "dimension87", js.undefined)
      
      @scala.inline
      def setDimension88(value: String): Self = StObject.set(x, "dimension88", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension88Undefined: Self = StObject.set(x, "dimension88", js.undefined)
      
      @scala.inline
      def setDimension89(value: String): Self = StObject.set(x, "dimension89", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension89Undefined: Self = StObject.set(x, "dimension89", js.undefined)
      
      @scala.inline
      def setDimension8Undefined: Self = StObject.set(x, "dimension8", js.undefined)
      
      @scala.inline
      def setDimension9(value: String): Self = StObject.set(x, "dimension9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension90(value: String): Self = StObject.set(x, "dimension90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension90Undefined: Self = StObject.set(x, "dimension90", js.undefined)
      
      @scala.inline
      def setDimension91(value: String): Self = StObject.set(x, "dimension91", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension91Undefined: Self = StObject.set(x, "dimension91", js.undefined)
      
      @scala.inline
      def setDimension92(value: String): Self = StObject.set(x, "dimension92", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension92Undefined: Self = StObject.set(x, "dimension92", js.undefined)
      
      @scala.inline
      def setDimension93(value: String): Self = StObject.set(x, "dimension93", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension93Undefined: Self = StObject.set(x, "dimension93", js.undefined)
      
      @scala.inline
      def setDimension94(value: String): Self = StObject.set(x, "dimension94", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension94Undefined: Self = StObject.set(x, "dimension94", js.undefined)
      
      @scala.inline
      def setDimension95(value: String): Self = StObject.set(x, "dimension95", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension95Undefined: Self = StObject.set(x, "dimension95", js.undefined)
      
      @scala.inline
      def setDimension96(value: String): Self = StObject.set(x, "dimension96", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension96Undefined: Self = StObject.set(x, "dimension96", js.undefined)
      
      @scala.inline
      def setDimension97(value: String): Self = StObject.set(x, "dimension97", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension97Undefined: Self = StObject.set(x, "dimension97", js.undefined)
      
      @scala.inline
      def setDimension98(value: String): Self = StObject.set(x, "dimension98", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension98Undefined: Self = StObject.set(x, "dimension98", js.undefined)
      
      @scala.inline
      def setDimension99(value: String): Self = StObject.set(x, "dimension99", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension99Undefined: Self = StObject.set(x, "dimension99", js.undefined)
      
      @scala.inline
      def setDimension9Undefined: Self = StObject.set(x, "dimension9", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
      
      @scala.inline
      def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
      
      @scala.inline
      def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      @scala.inline
      def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      @scala.inline
      def setExDescription(value: String): Self = StObject.set(x, "exDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExDescriptionUndefined: Self = StObject.set(x, "exDescription", js.undefined)
      
      @scala.inline
      def setExFatal(value: Boolean): Self = StObject.set(x, "exFatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExFatalUndefined: Self = StObject.set(x, "exFatal", js.undefined)
      
      @scala.inline
      def setExpId(value: String): Self = StObject.set(x, "expId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpIdUndefined: Self = StObject.set(x, "expId", js.undefined)
      
      @scala.inline
      def setExpVar(value: String): Self = StObject.set(x, "expVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpVarUndefined: Self = StObject.set(x, "expVar", js.undefined)
      
      @scala.inline
      def setFlashVersion(value: String): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashVersionUndefined: Self = StObject.set(x, "flashVersion", js.undefined)
      
      @scala.inline
      def setForceSSL(value: Boolean): Self = StObject.set(x, "forceSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSSLUndefined: Self = StObject.set(x, "forceSSL", js.undefined)
      
      @scala.inline
      def setHitCallback(value: () => Unit): Self = StObject.set(x, "hitCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHitCallbackUndefined: Self = StObject.set(x, "hitCallback", js.undefined)
      
      @scala.inline
      def setHitType(value: HitType): Self = StObject.set(x, "hitType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitTypeUndefined: Self = StObject.set(x, "hitType", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setJavaEnabled(value: Boolean): Self = StObject.set(x, "javaEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaEnabledUndefined: Self = StObject.set(x, "javaEnabled", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLegacyCookieDomain(value: String): Self = StObject.set(x, "legacyCookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyCookieDomainUndefined: Self = StObject.set(x, "legacyCookieDomain", js.undefined)
      
      @scala.inline
      def setLegacyHistoryImport(value: Boolean): Self = StObject.set(x, "legacyHistoryImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyHistoryImportUndefined: Self = StObject.set(x, "legacyHistoryImport", js.undefined)
      
      @scala.inline
      def setLinkid(value: String): Self = StObject.set(x, "linkid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkidUndefined: Self = StObject.set(x, "linkid", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMetric1(value: String | Double): Self = StObject.set(x, "metric1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric10(value: String | Double): Self = StObject.set(x, "metric10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric100(value: String | Double): Self = StObject.set(x, "metric100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric100Undefined: Self = StObject.set(x, "metric100", js.undefined)
      
      @scala.inline
      def setMetric101(value: String | Double): Self = StObject.set(x, "metric101", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric101Undefined: Self = StObject.set(x, "metric101", js.undefined)
      
      @scala.inline
      def setMetric102(value: String | Double): Self = StObject.set(x, "metric102", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric102Undefined: Self = StObject.set(x, "metric102", js.undefined)
      
      @scala.inline
      def setMetric103(value: String | Double): Self = StObject.set(x, "metric103", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric103Undefined: Self = StObject.set(x, "metric103", js.undefined)
      
      @scala.inline
      def setMetric104(value: String | Double): Self = StObject.set(x, "metric104", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric104Undefined: Self = StObject.set(x, "metric104", js.undefined)
      
      @scala.inline
      def setMetric105(value: String | Double): Self = StObject.set(x, "metric105", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric105Undefined: Self = StObject.set(x, "metric105", js.undefined)
      
      @scala.inline
      def setMetric106(value: String | Double): Self = StObject.set(x, "metric106", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric106Undefined: Self = StObject.set(x, "metric106", js.undefined)
      
      @scala.inline
      def setMetric107(value: String | Double): Self = StObject.set(x, "metric107", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric107Undefined: Self = StObject.set(x, "metric107", js.undefined)
      
      @scala.inline
      def setMetric108(value: String | Double): Self = StObject.set(x, "metric108", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric108Undefined: Self = StObject.set(x, "metric108", js.undefined)
      
      @scala.inline
      def setMetric109(value: String | Double): Self = StObject.set(x, "metric109", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric109Undefined: Self = StObject.set(x, "metric109", js.undefined)
      
      @scala.inline
      def setMetric10Undefined: Self = StObject.set(x, "metric10", js.undefined)
      
      @scala.inline
      def setMetric11(value: String | Double): Self = StObject.set(x, "metric11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric110(value: String | Double): Self = StObject.set(x, "metric110", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric110Undefined: Self = StObject.set(x, "metric110", js.undefined)
      
      @scala.inline
      def setMetric111(value: String | Double): Self = StObject.set(x, "metric111", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric111Undefined: Self = StObject.set(x, "metric111", js.undefined)
      
      @scala.inline
      def setMetric112(value: String | Double): Self = StObject.set(x, "metric112", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric112Undefined: Self = StObject.set(x, "metric112", js.undefined)
      
      @scala.inline
      def setMetric113(value: String | Double): Self = StObject.set(x, "metric113", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric113Undefined: Self = StObject.set(x, "metric113", js.undefined)
      
      @scala.inline
      def setMetric114(value: String | Double): Self = StObject.set(x, "metric114", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric114Undefined: Self = StObject.set(x, "metric114", js.undefined)
      
      @scala.inline
      def setMetric115(value: String | Double): Self = StObject.set(x, "metric115", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric115Undefined: Self = StObject.set(x, "metric115", js.undefined)
      
      @scala.inline
      def setMetric116(value: String | Double): Self = StObject.set(x, "metric116", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric116Undefined: Self = StObject.set(x, "metric116", js.undefined)
      
      @scala.inline
      def setMetric117(value: String | Double): Self = StObject.set(x, "metric117", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric117Undefined: Self = StObject.set(x, "metric117", js.undefined)
      
      @scala.inline
      def setMetric118(value: String | Double): Self = StObject.set(x, "metric118", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric118Undefined: Self = StObject.set(x, "metric118", js.undefined)
      
      @scala.inline
      def setMetric119(value: String | Double): Self = StObject.set(x, "metric119", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric119Undefined: Self = StObject.set(x, "metric119", js.undefined)
      
      @scala.inline
      def setMetric11Undefined: Self = StObject.set(x, "metric11", js.undefined)
      
      @scala.inline
      def setMetric12(value: String | Double): Self = StObject.set(x, "metric12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric120(value: String | Double): Self = StObject.set(x, "metric120", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric120Undefined: Self = StObject.set(x, "metric120", js.undefined)
      
      @scala.inline
      def setMetric121(value: String | Double): Self = StObject.set(x, "metric121", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric121Undefined: Self = StObject.set(x, "metric121", js.undefined)
      
      @scala.inline
      def setMetric122(value: String | Double): Self = StObject.set(x, "metric122", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric122Undefined: Self = StObject.set(x, "metric122", js.undefined)
      
      @scala.inline
      def setMetric123(value: String | Double): Self = StObject.set(x, "metric123", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric123Undefined: Self = StObject.set(x, "metric123", js.undefined)
      
      @scala.inline
      def setMetric124(value: String | Double): Self = StObject.set(x, "metric124", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric124Undefined: Self = StObject.set(x, "metric124", js.undefined)
      
      @scala.inline
      def setMetric125(value: String | Double): Self = StObject.set(x, "metric125", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric125Undefined: Self = StObject.set(x, "metric125", js.undefined)
      
      @scala.inline
      def setMetric126(value: String | Double): Self = StObject.set(x, "metric126", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric126Undefined: Self = StObject.set(x, "metric126", js.undefined)
      
      @scala.inline
      def setMetric127(value: String | Double): Self = StObject.set(x, "metric127", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric127Undefined: Self = StObject.set(x, "metric127", js.undefined)
      
      @scala.inline
      def setMetric128(value: String | Double): Self = StObject.set(x, "metric128", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric128Undefined: Self = StObject.set(x, "metric128", js.undefined)
      
      @scala.inline
      def setMetric129(value: String | Double): Self = StObject.set(x, "metric129", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric129Undefined: Self = StObject.set(x, "metric129", js.undefined)
      
      @scala.inline
      def setMetric12Undefined: Self = StObject.set(x, "metric12", js.undefined)
      
      @scala.inline
      def setMetric13(value: String | Double): Self = StObject.set(x, "metric13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric130(value: String | Double): Self = StObject.set(x, "metric130", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric130Undefined: Self = StObject.set(x, "metric130", js.undefined)
      
      @scala.inline
      def setMetric131(value: String | Double): Self = StObject.set(x, "metric131", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric131Undefined: Self = StObject.set(x, "metric131", js.undefined)
      
      @scala.inline
      def setMetric132(value: String | Double): Self = StObject.set(x, "metric132", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric132Undefined: Self = StObject.set(x, "metric132", js.undefined)
      
      @scala.inline
      def setMetric133(value: String | Double): Self = StObject.set(x, "metric133", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric133Undefined: Self = StObject.set(x, "metric133", js.undefined)
      
      @scala.inline
      def setMetric134(value: String | Double): Self = StObject.set(x, "metric134", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric134Undefined: Self = StObject.set(x, "metric134", js.undefined)
      
      @scala.inline
      def setMetric135(value: String | Double): Self = StObject.set(x, "metric135", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric135Undefined: Self = StObject.set(x, "metric135", js.undefined)
      
      @scala.inline
      def setMetric136(value: String | Double): Self = StObject.set(x, "metric136", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric136Undefined: Self = StObject.set(x, "metric136", js.undefined)
      
      @scala.inline
      def setMetric137(value: String | Double): Self = StObject.set(x, "metric137", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric137Undefined: Self = StObject.set(x, "metric137", js.undefined)
      
      @scala.inline
      def setMetric138(value: String | Double): Self = StObject.set(x, "metric138", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric138Undefined: Self = StObject.set(x, "metric138", js.undefined)
      
      @scala.inline
      def setMetric139(value: String | Double): Self = StObject.set(x, "metric139", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric139Undefined: Self = StObject.set(x, "metric139", js.undefined)
      
      @scala.inline
      def setMetric13Undefined: Self = StObject.set(x, "metric13", js.undefined)
      
      @scala.inline
      def setMetric14(value: String | Double): Self = StObject.set(x, "metric14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric140(value: String | Double): Self = StObject.set(x, "metric140", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric140Undefined: Self = StObject.set(x, "metric140", js.undefined)
      
      @scala.inline
      def setMetric141(value: String | Double): Self = StObject.set(x, "metric141", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric141Undefined: Self = StObject.set(x, "metric141", js.undefined)
      
      @scala.inline
      def setMetric142(value: String | Double): Self = StObject.set(x, "metric142", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric142Undefined: Self = StObject.set(x, "metric142", js.undefined)
      
      @scala.inline
      def setMetric143(value: String | Double): Self = StObject.set(x, "metric143", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric143Undefined: Self = StObject.set(x, "metric143", js.undefined)
      
      @scala.inline
      def setMetric144(value: String | Double): Self = StObject.set(x, "metric144", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric144Undefined: Self = StObject.set(x, "metric144", js.undefined)
      
      @scala.inline
      def setMetric145(value: String | Double): Self = StObject.set(x, "metric145", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric145Undefined: Self = StObject.set(x, "metric145", js.undefined)
      
      @scala.inline
      def setMetric146(value: String | Double): Self = StObject.set(x, "metric146", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric146Undefined: Self = StObject.set(x, "metric146", js.undefined)
      
      @scala.inline
      def setMetric147(value: String | Double): Self = StObject.set(x, "metric147", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric147Undefined: Self = StObject.set(x, "metric147", js.undefined)
      
      @scala.inline
      def setMetric148(value: String | Double): Self = StObject.set(x, "metric148", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric148Undefined: Self = StObject.set(x, "metric148", js.undefined)
      
      @scala.inline
      def setMetric149(value: String | Double): Self = StObject.set(x, "metric149", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric149Undefined: Self = StObject.set(x, "metric149", js.undefined)
      
      @scala.inline
      def setMetric14Undefined: Self = StObject.set(x, "metric14", js.undefined)
      
      @scala.inline
      def setMetric15(value: String | Double): Self = StObject.set(x, "metric15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric150(value: String | Double): Self = StObject.set(x, "metric150", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric150Undefined: Self = StObject.set(x, "metric150", js.undefined)
      
      @scala.inline
      def setMetric151(value: String | Double): Self = StObject.set(x, "metric151", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric151Undefined: Self = StObject.set(x, "metric151", js.undefined)
      
      @scala.inline
      def setMetric152(value: String | Double): Self = StObject.set(x, "metric152", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric152Undefined: Self = StObject.set(x, "metric152", js.undefined)
      
      @scala.inline
      def setMetric153(value: String | Double): Self = StObject.set(x, "metric153", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric153Undefined: Self = StObject.set(x, "metric153", js.undefined)
      
      @scala.inline
      def setMetric154(value: String | Double): Self = StObject.set(x, "metric154", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric154Undefined: Self = StObject.set(x, "metric154", js.undefined)
      
      @scala.inline
      def setMetric155(value: String | Double): Self = StObject.set(x, "metric155", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric155Undefined: Self = StObject.set(x, "metric155", js.undefined)
      
      @scala.inline
      def setMetric156(value: String | Double): Self = StObject.set(x, "metric156", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric156Undefined: Self = StObject.set(x, "metric156", js.undefined)
      
      @scala.inline
      def setMetric157(value: String | Double): Self = StObject.set(x, "metric157", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric157Undefined: Self = StObject.set(x, "metric157", js.undefined)
      
      @scala.inline
      def setMetric158(value: String | Double): Self = StObject.set(x, "metric158", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric158Undefined: Self = StObject.set(x, "metric158", js.undefined)
      
      @scala.inline
      def setMetric159(value: String | Double): Self = StObject.set(x, "metric159", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric159Undefined: Self = StObject.set(x, "metric159", js.undefined)
      
      @scala.inline
      def setMetric15Undefined: Self = StObject.set(x, "metric15", js.undefined)
      
      @scala.inline
      def setMetric16(value: String | Double): Self = StObject.set(x, "metric16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric160(value: String | Double): Self = StObject.set(x, "metric160", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric160Undefined: Self = StObject.set(x, "metric160", js.undefined)
      
      @scala.inline
      def setMetric161(value: String | Double): Self = StObject.set(x, "metric161", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric161Undefined: Self = StObject.set(x, "metric161", js.undefined)
      
      @scala.inline
      def setMetric162(value: String | Double): Self = StObject.set(x, "metric162", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric162Undefined: Self = StObject.set(x, "metric162", js.undefined)
      
      @scala.inline
      def setMetric163(value: String | Double): Self = StObject.set(x, "metric163", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric163Undefined: Self = StObject.set(x, "metric163", js.undefined)
      
      @scala.inline
      def setMetric164(value: String | Double): Self = StObject.set(x, "metric164", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric164Undefined: Self = StObject.set(x, "metric164", js.undefined)
      
      @scala.inline
      def setMetric165(value: String | Double): Self = StObject.set(x, "metric165", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric165Undefined: Self = StObject.set(x, "metric165", js.undefined)
      
      @scala.inline
      def setMetric166(value: String | Double): Self = StObject.set(x, "metric166", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric166Undefined: Self = StObject.set(x, "metric166", js.undefined)
      
      @scala.inline
      def setMetric167(value: String | Double): Self = StObject.set(x, "metric167", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric167Undefined: Self = StObject.set(x, "metric167", js.undefined)
      
      @scala.inline
      def setMetric168(value: String | Double): Self = StObject.set(x, "metric168", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric168Undefined: Self = StObject.set(x, "metric168", js.undefined)
      
      @scala.inline
      def setMetric169(value: String | Double): Self = StObject.set(x, "metric169", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric169Undefined: Self = StObject.set(x, "metric169", js.undefined)
      
      @scala.inline
      def setMetric16Undefined: Self = StObject.set(x, "metric16", js.undefined)
      
      @scala.inline
      def setMetric17(value: String | Double): Self = StObject.set(x, "metric17", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric170(value: String | Double): Self = StObject.set(x, "metric170", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric170Undefined: Self = StObject.set(x, "metric170", js.undefined)
      
      @scala.inline
      def setMetric171(value: String | Double): Self = StObject.set(x, "metric171", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric171Undefined: Self = StObject.set(x, "metric171", js.undefined)
      
      @scala.inline
      def setMetric172(value: String | Double): Self = StObject.set(x, "metric172", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric172Undefined: Self = StObject.set(x, "metric172", js.undefined)
      
      @scala.inline
      def setMetric173(value: String | Double): Self = StObject.set(x, "metric173", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric173Undefined: Self = StObject.set(x, "metric173", js.undefined)
      
      @scala.inline
      def setMetric174(value: String | Double): Self = StObject.set(x, "metric174", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric174Undefined: Self = StObject.set(x, "metric174", js.undefined)
      
      @scala.inline
      def setMetric175(value: String | Double): Self = StObject.set(x, "metric175", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric175Undefined: Self = StObject.set(x, "metric175", js.undefined)
      
      @scala.inline
      def setMetric176(value: String | Double): Self = StObject.set(x, "metric176", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric176Undefined: Self = StObject.set(x, "metric176", js.undefined)
      
      @scala.inline
      def setMetric177(value: String | Double): Self = StObject.set(x, "metric177", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric177Undefined: Self = StObject.set(x, "metric177", js.undefined)
      
      @scala.inline
      def setMetric178(value: String | Double): Self = StObject.set(x, "metric178", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric178Undefined: Self = StObject.set(x, "metric178", js.undefined)
      
      @scala.inline
      def setMetric179(value: String | Double): Self = StObject.set(x, "metric179", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric179Undefined: Self = StObject.set(x, "metric179", js.undefined)
      
      @scala.inline
      def setMetric17Undefined: Self = StObject.set(x, "metric17", js.undefined)
      
      @scala.inline
      def setMetric18(value: String | Double): Self = StObject.set(x, "metric18", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric180(value: String | Double): Self = StObject.set(x, "metric180", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric180Undefined: Self = StObject.set(x, "metric180", js.undefined)
      
      @scala.inline
      def setMetric181(value: String | Double): Self = StObject.set(x, "metric181", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric181Undefined: Self = StObject.set(x, "metric181", js.undefined)
      
      @scala.inline
      def setMetric182(value: String | Double): Self = StObject.set(x, "metric182", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric182Undefined: Self = StObject.set(x, "metric182", js.undefined)
      
      @scala.inline
      def setMetric183(value: String | Double): Self = StObject.set(x, "metric183", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric183Undefined: Self = StObject.set(x, "metric183", js.undefined)
      
      @scala.inline
      def setMetric184(value: String | Double): Self = StObject.set(x, "metric184", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric184Undefined: Self = StObject.set(x, "metric184", js.undefined)
      
      @scala.inline
      def setMetric185(value: String | Double): Self = StObject.set(x, "metric185", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric185Undefined: Self = StObject.set(x, "metric185", js.undefined)
      
      @scala.inline
      def setMetric186(value: String | Double): Self = StObject.set(x, "metric186", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric186Undefined: Self = StObject.set(x, "metric186", js.undefined)
      
      @scala.inline
      def setMetric187(value: String | Double): Self = StObject.set(x, "metric187", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric187Undefined: Self = StObject.set(x, "metric187", js.undefined)
      
      @scala.inline
      def setMetric188(value: String | Double): Self = StObject.set(x, "metric188", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric188Undefined: Self = StObject.set(x, "metric188", js.undefined)
      
      @scala.inline
      def setMetric189(value: String | Double): Self = StObject.set(x, "metric189", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric189Undefined: Self = StObject.set(x, "metric189", js.undefined)
      
      @scala.inline
      def setMetric18Undefined: Self = StObject.set(x, "metric18", js.undefined)
      
      @scala.inline
      def setMetric19(value: String | Double): Self = StObject.set(x, "metric19", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric190(value: String | Double): Self = StObject.set(x, "metric190", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric190Undefined: Self = StObject.set(x, "metric190", js.undefined)
      
      @scala.inline
      def setMetric191(value: String | Double): Self = StObject.set(x, "metric191", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric191Undefined: Self = StObject.set(x, "metric191", js.undefined)
      
      @scala.inline
      def setMetric192(value: String | Double): Self = StObject.set(x, "metric192", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric192Undefined: Self = StObject.set(x, "metric192", js.undefined)
      
      @scala.inline
      def setMetric193(value: String | Double): Self = StObject.set(x, "metric193", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric193Undefined: Self = StObject.set(x, "metric193", js.undefined)
      
      @scala.inline
      def setMetric194(value: String | Double): Self = StObject.set(x, "metric194", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric194Undefined: Self = StObject.set(x, "metric194", js.undefined)
      
      @scala.inline
      def setMetric195(value: String | Double): Self = StObject.set(x, "metric195", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric195Undefined: Self = StObject.set(x, "metric195", js.undefined)
      
      @scala.inline
      def setMetric196(value: String | Double): Self = StObject.set(x, "metric196", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric196Undefined: Self = StObject.set(x, "metric196", js.undefined)
      
      @scala.inline
      def setMetric197(value: String | Double): Self = StObject.set(x, "metric197", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric197Undefined: Self = StObject.set(x, "metric197", js.undefined)
      
      @scala.inline
      def setMetric198(value: String | Double): Self = StObject.set(x, "metric198", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric198Undefined: Self = StObject.set(x, "metric198", js.undefined)
      
      @scala.inline
      def setMetric199(value: String | Double): Self = StObject.set(x, "metric199", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric199Undefined: Self = StObject.set(x, "metric199", js.undefined)
      
      @scala.inline
      def setMetric19Undefined: Self = StObject.set(x, "metric19", js.undefined)
      
      @scala.inline
      def setMetric1Undefined: Self = StObject.set(x, "metric1", js.undefined)
      
      @scala.inline
      def setMetric2(value: String | Double): Self = StObject.set(x, "metric2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric20(value: String | Double): Self = StObject.set(x, "metric20", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric200(value: String | Double): Self = StObject.set(x, "metric200", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric200Undefined: Self = StObject.set(x, "metric200", js.undefined)
      
      @scala.inline
      def setMetric20Undefined: Self = StObject.set(x, "metric20", js.undefined)
      
      @scala.inline
      def setMetric21(value: String | Double): Self = StObject.set(x, "metric21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric21Undefined: Self = StObject.set(x, "metric21", js.undefined)
      
      @scala.inline
      def setMetric22(value: String | Double): Self = StObject.set(x, "metric22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric22Undefined: Self = StObject.set(x, "metric22", js.undefined)
      
      @scala.inline
      def setMetric23(value: String | Double): Self = StObject.set(x, "metric23", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric23Undefined: Self = StObject.set(x, "metric23", js.undefined)
      
      @scala.inline
      def setMetric24(value: String | Double): Self = StObject.set(x, "metric24", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric24Undefined: Self = StObject.set(x, "metric24", js.undefined)
      
      @scala.inline
      def setMetric25(value: String | Double): Self = StObject.set(x, "metric25", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric25Undefined: Self = StObject.set(x, "metric25", js.undefined)
      
      @scala.inline
      def setMetric26(value: String | Double): Self = StObject.set(x, "metric26", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric26Undefined: Self = StObject.set(x, "metric26", js.undefined)
      
      @scala.inline
      def setMetric27(value: String | Double): Self = StObject.set(x, "metric27", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric27Undefined: Self = StObject.set(x, "metric27", js.undefined)
      
      @scala.inline
      def setMetric28(value: String | Double): Self = StObject.set(x, "metric28", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric28Undefined: Self = StObject.set(x, "metric28", js.undefined)
      
      @scala.inline
      def setMetric29(value: String | Double): Self = StObject.set(x, "metric29", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric29Undefined: Self = StObject.set(x, "metric29", js.undefined)
      
      @scala.inline
      def setMetric2Undefined: Self = StObject.set(x, "metric2", js.undefined)
      
      @scala.inline
      def setMetric3(value: String | Double): Self = StObject.set(x, "metric3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric30(value: String | Double): Self = StObject.set(x, "metric30", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric30Undefined: Self = StObject.set(x, "metric30", js.undefined)
      
      @scala.inline
      def setMetric31(value: String | Double): Self = StObject.set(x, "metric31", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric31Undefined: Self = StObject.set(x, "metric31", js.undefined)
      
      @scala.inline
      def setMetric32(value: String | Double): Self = StObject.set(x, "metric32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric32Undefined: Self = StObject.set(x, "metric32", js.undefined)
      
      @scala.inline
      def setMetric33(value: String | Double): Self = StObject.set(x, "metric33", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric33Undefined: Self = StObject.set(x, "metric33", js.undefined)
      
      @scala.inline
      def setMetric34(value: String | Double): Self = StObject.set(x, "metric34", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric34Undefined: Self = StObject.set(x, "metric34", js.undefined)
      
      @scala.inline
      def setMetric35(value: String | Double): Self = StObject.set(x, "metric35", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric35Undefined: Self = StObject.set(x, "metric35", js.undefined)
      
      @scala.inline
      def setMetric36(value: String | Double): Self = StObject.set(x, "metric36", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric36Undefined: Self = StObject.set(x, "metric36", js.undefined)
      
      @scala.inline
      def setMetric37(value: String | Double): Self = StObject.set(x, "metric37", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric37Undefined: Self = StObject.set(x, "metric37", js.undefined)
      
      @scala.inline
      def setMetric38(value: String | Double): Self = StObject.set(x, "metric38", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric38Undefined: Self = StObject.set(x, "metric38", js.undefined)
      
      @scala.inline
      def setMetric39(value: String | Double): Self = StObject.set(x, "metric39", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric39Undefined: Self = StObject.set(x, "metric39", js.undefined)
      
      @scala.inline
      def setMetric3Undefined: Self = StObject.set(x, "metric3", js.undefined)
      
      @scala.inline
      def setMetric4(value: String | Double): Self = StObject.set(x, "metric4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric40(value: String | Double): Self = StObject.set(x, "metric40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric40Undefined: Self = StObject.set(x, "metric40", js.undefined)
      
      @scala.inline
      def setMetric41(value: String | Double): Self = StObject.set(x, "metric41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric41Undefined: Self = StObject.set(x, "metric41", js.undefined)
      
      @scala.inline
      def setMetric42(value: String | Double): Self = StObject.set(x, "metric42", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric42Undefined: Self = StObject.set(x, "metric42", js.undefined)
      
      @scala.inline
      def setMetric43(value: String | Double): Self = StObject.set(x, "metric43", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric43Undefined: Self = StObject.set(x, "metric43", js.undefined)
      
      @scala.inline
      def setMetric44(value: String | Double): Self = StObject.set(x, "metric44", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric44Undefined: Self = StObject.set(x, "metric44", js.undefined)
      
      @scala.inline
      def setMetric45(value: String | Double): Self = StObject.set(x, "metric45", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric45Undefined: Self = StObject.set(x, "metric45", js.undefined)
      
      @scala.inline
      def setMetric46(value: String | Double): Self = StObject.set(x, "metric46", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric46Undefined: Self = StObject.set(x, "metric46", js.undefined)
      
      @scala.inline
      def setMetric47(value: String | Double): Self = StObject.set(x, "metric47", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric47Undefined: Self = StObject.set(x, "metric47", js.undefined)
      
      @scala.inline
      def setMetric48(value: String | Double): Self = StObject.set(x, "metric48", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric48Undefined: Self = StObject.set(x, "metric48", js.undefined)
      
      @scala.inline
      def setMetric49(value: String | Double): Self = StObject.set(x, "metric49", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric49Undefined: Self = StObject.set(x, "metric49", js.undefined)
      
      @scala.inline
      def setMetric4Undefined: Self = StObject.set(x, "metric4", js.undefined)
      
      @scala.inline
      def setMetric5(value: String | Double): Self = StObject.set(x, "metric5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric50(value: String | Double): Self = StObject.set(x, "metric50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric50Undefined: Self = StObject.set(x, "metric50", js.undefined)
      
      @scala.inline
      def setMetric51(value: String | Double): Self = StObject.set(x, "metric51", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric51Undefined: Self = StObject.set(x, "metric51", js.undefined)
      
      @scala.inline
      def setMetric52(value: String | Double): Self = StObject.set(x, "metric52", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric52Undefined: Self = StObject.set(x, "metric52", js.undefined)
      
      @scala.inline
      def setMetric53(value: String | Double): Self = StObject.set(x, "metric53", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric53Undefined: Self = StObject.set(x, "metric53", js.undefined)
      
      @scala.inline
      def setMetric54(value: String | Double): Self = StObject.set(x, "metric54", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric54Undefined: Self = StObject.set(x, "metric54", js.undefined)
      
      @scala.inline
      def setMetric55(value: String | Double): Self = StObject.set(x, "metric55", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric55Undefined: Self = StObject.set(x, "metric55", js.undefined)
      
      @scala.inline
      def setMetric56(value: String | Double): Self = StObject.set(x, "metric56", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric56Undefined: Self = StObject.set(x, "metric56", js.undefined)
      
      @scala.inline
      def setMetric57(value: String | Double): Self = StObject.set(x, "metric57", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric57Undefined: Self = StObject.set(x, "metric57", js.undefined)
      
      @scala.inline
      def setMetric58(value: String | Double): Self = StObject.set(x, "metric58", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric58Undefined: Self = StObject.set(x, "metric58", js.undefined)
      
      @scala.inline
      def setMetric59(value: String | Double): Self = StObject.set(x, "metric59", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric59Undefined: Self = StObject.set(x, "metric59", js.undefined)
      
      @scala.inline
      def setMetric5Undefined: Self = StObject.set(x, "metric5", js.undefined)
      
      @scala.inline
      def setMetric6(value: String | Double): Self = StObject.set(x, "metric6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric60(value: String | Double): Self = StObject.set(x, "metric60", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric60Undefined: Self = StObject.set(x, "metric60", js.undefined)
      
      @scala.inline
      def setMetric61(value: String | Double): Self = StObject.set(x, "metric61", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric61Undefined: Self = StObject.set(x, "metric61", js.undefined)
      
      @scala.inline
      def setMetric62(value: String | Double): Self = StObject.set(x, "metric62", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric62Undefined: Self = StObject.set(x, "metric62", js.undefined)
      
      @scala.inline
      def setMetric63(value: String | Double): Self = StObject.set(x, "metric63", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric63Undefined: Self = StObject.set(x, "metric63", js.undefined)
      
      @scala.inline
      def setMetric64(value: String | Double): Self = StObject.set(x, "metric64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric64Undefined: Self = StObject.set(x, "metric64", js.undefined)
      
      @scala.inline
      def setMetric65(value: String | Double): Self = StObject.set(x, "metric65", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric65Undefined: Self = StObject.set(x, "metric65", js.undefined)
      
      @scala.inline
      def setMetric66(value: String | Double): Self = StObject.set(x, "metric66", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric66Undefined: Self = StObject.set(x, "metric66", js.undefined)
      
      @scala.inline
      def setMetric67(value: String | Double): Self = StObject.set(x, "metric67", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric67Undefined: Self = StObject.set(x, "metric67", js.undefined)
      
      @scala.inline
      def setMetric68(value: String | Double): Self = StObject.set(x, "metric68", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric68Undefined: Self = StObject.set(x, "metric68", js.undefined)
      
      @scala.inline
      def setMetric69(value: String | Double): Self = StObject.set(x, "metric69", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric69Undefined: Self = StObject.set(x, "metric69", js.undefined)
      
      @scala.inline
      def setMetric6Undefined: Self = StObject.set(x, "metric6", js.undefined)
      
      @scala.inline
      def setMetric7(value: String | Double): Self = StObject.set(x, "metric7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric70(value: String | Double): Self = StObject.set(x, "metric70", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric70Undefined: Self = StObject.set(x, "metric70", js.undefined)
      
      @scala.inline
      def setMetric71(value: String | Double): Self = StObject.set(x, "metric71", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric71Undefined: Self = StObject.set(x, "metric71", js.undefined)
      
      @scala.inline
      def setMetric72(value: String | Double): Self = StObject.set(x, "metric72", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric72Undefined: Self = StObject.set(x, "metric72", js.undefined)
      
      @scala.inline
      def setMetric73(value: String | Double): Self = StObject.set(x, "metric73", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric73Undefined: Self = StObject.set(x, "metric73", js.undefined)
      
      @scala.inline
      def setMetric74(value: String | Double): Self = StObject.set(x, "metric74", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric74Undefined: Self = StObject.set(x, "metric74", js.undefined)
      
      @scala.inline
      def setMetric75(value: String | Double): Self = StObject.set(x, "metric75", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric75Undefined: Self = StObject.set(x, "metric75", js.undefined)
      
      @scala.inline
      def setMetric76(value: String | Double): Self = StObject.set(x, "metric76", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric76Undefined: Self = StObject.set(x, "metric76", js.undefined)
      
      @scala.inline
      def setMetric77(value: String | Double): Self = StObject.set(x, "metric77", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric77Undefined: Self = StObject.set(x, "metric77", js.undefined)
      
      @scala.inline
      def setMetric78(value: String | Double): Self = StObject.set(x, "metric78", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric78Undefined: Self = StObject.set(x, "metric78", js.undefined)
      
      @scala.inline
      def setMetric79(value: String | Double): Self = StObject.set(x, "metric79", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric79Undefined: Self = StObject.set(x, "metric79", js.undefined)
      
      @scala.inline
      def setMetric7Undefined: Self = StObject.set(x, "metric7", js.undefined)
      
      @scala.inline
      def setMetric8(value: String | Double): Self = StObject.set(x, "metric8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric80(value: String | Double): Self = StObject.set(x, "metric80", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric80Undefined: Self = StObject.set(x, "metric80", js.undefined)
      
      @scala.inline
      def setMetric81(value: String | Double): Self = StObject.set(x, "metric81", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric81Undefined: Self = StObject.set(x, "metric81", js.undefined)
      
      @scala.inline
      def setMetric82(value: String | Double): Self = StObject.set(x, "metric82", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric82Undefined: Self = StObject.set(x, "metric82", js.undefined)
      
      @scala.inline
      def setMetric83(value: String | Double): Self = StObject.set(x, "metric83", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric83Undefined: Self = StObject.set(x, "metric83", js.undefined)
      
      @scala.inline
      def setMetric84(value: String | Double): Self = StObject.set(x, "metric84", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric84Undefined: Self = StObject.set(x, "metric84", js.undefined)
      
      @scala.inline
      def setMetric85(value: String | Double): Self = StObject.set(x, "metric85", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric85Undefined: Self = StObject.set(x, "metric85", js.undefined)
      
      @scala.inline
      def setMetric86(value: String | Double): Self = StObject.set(x, "metric86", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric86Undefined: Self = StObject.set(x, "metric86", js.undefined)
      
      @scala.inline
      def setMetric87(value: String | Double): Self = StObject.set(x, "metric87", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric87Undefined: Self = StObject.set(x, "metric87", js.undefined)
      
      @scala.inline
      def setMetric88(value: String | Double): Self = StObject.set(x, "metric88", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric88Undefined: Self = StObject.set(x, "metric88", js.undefined)
      
      @scala.inline
      def setMetric89(value: String | Double): Self = StObject.set(x, "metric89", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric89Undefined: Self = StObject.set(x, "metric89", js.undefined)
      
      @scala.inline
      def setMetric8Undefined: Self = StObject.set(x, "metric8", js.undefined)
      
      @scala.inline
      def setMetric9(value: String | Double): Self = StObject.set(x, "metric9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric90(value: String | Double): Self = StObject.set(x, "metric90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric90Undefined: Self = StObject.set(x, "metric90", js.undefined)
      
      @scala.inline
      def setMetric91(value: String | Double): Self = StObject.set(x, "metric91", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric91Undefined: Self = StObject.set(x, "metric91", js.undefined)
      
      @scala.inline
      def setMetric92(value: String | Double): Self = StObject.set(x, "metric92", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric92Undefined: Self = StObject.set(x, "metric92", js.undefined)
      
      @scala.inline
      def setMetric93(value: String | Double): Self = StObject.set(x, "metric93", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric93Undefined: Self = StObject.set(x, "metric93", js.undefined)
      
      @scala.inline
      def setMetric94(value: String | Double): Self = StObject.set(x, "metric94", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric94Undefined: Self = StObject.set(x, "metric94", js.undefined)
      
      @scala.inline
      def setMetric95(value: String | Double): Self = StObject.set(x, "metric95", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric95Undefined: Self = StObject.set(x, "metric95", js.undefined)
      
      @scala.inline
      def setMetric96(value: String | Double): Self = StObject.set(x, "metric96", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric96Undefined: Self = StObject.set(x, "metric96", js.undefined)
      
      @scala.inline
      def setMetric97(value: String | Double): Self = StObject.set(x, "metric97", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric97Undefined: Self = StObject.set(x, "metric97", js.undefined)
      
      @scala.inline
      def setMetric98(value: String | Double): Self = StObject.set(x, "metric98", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric98Undefined: Self = StObject.set(x, "metric98", js.undefined)
      
      @scala.inline
      def setMetric99(value: String | Double): Self = StObject.set(x, "metric99", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric99Undefined: Self = StObject.set(x, "metric99", js.undefined)
      
      @scala.inline
      def setMetric9Undefined: Self = StObject.set(x, "metric9", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
      
      @scala.inline
      def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPosition(value: Double | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setQueueTime(value: Double): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueTimeUndefined: Self = StObject.set(x, "queueTime", js.undefined)
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      @scala.inline
      def setRevenue(value: String): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setScreenColors(value: String): Self = StObject.set(x, "screenColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenColorsUndefined: Self = StObject.set(x, "screenColors", js.undefined)
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      
      @scala.inline
      def setScreenResolution(value: String): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
      
      @scala.inline
      def setSessionControl(value: String): Self = StObject.set(x, "sessionControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionControlUndefined: Self = StObject.set(x, "sessionControl", js.undefined)
      
      @scala.inline
      def setShipping(value: String): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setSiteSpeedSampleRate(value: Double): Self = StObject.set(x, "siteSpeedSampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSpeedSampleRateUndefined: Self = StObject.set(x, "siteSpeedSampleRate", js.undefined)
      
      @scala.inline
      def setSocialAction(value: String): Self = StObject.set(x, "socialAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocialActionUndefined: Self = StObject.set(x, "socialAction", js.undefined)
      
      @scala.inline
      def setSocialNetwork(value: String): Self = StObject.set(x, "socialNetwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocialNetworkUndefined: Self = StObject.set(x, "socialNetwork", js.undefined)
      
      @scala.inline
      def setSocialTarget(value: String): Self = StObject.set(x, "socialTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocialTargetUndefined: Self = StObject.set(x, "socialTarget", js.undefined)
      
      @scala.inline
      def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      @scala.inline
      def setStep(value: Boolean | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setStoreGac(value: Boolean): Self = StObject.set(x, "storeGac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreGacUndefined: Self = StObject.set(x, "storeGac", js.undefined)
      
      @scala.inline
      def setTax(value: String): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
      
      @scala.inline
      def setTimingCategory(value: String): Self = StObject.set(x, "timingCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingCategoryUndefined: Self = StObject.set(x, "timingCategory", js.undefined)
      
      @scala.inline
      def setTimingLabel(value: String): Self = StObject.set(x, "timingLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingLabelUndefined: Self = StObject.set(x, "timingLabel", js.undefined)
      
      @scala.inline
      def setTimingValue(value: Double): Self = StObject.set(x, "timingValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingValueUndefined: Self = StObject.set(x, "timingValue", js.undefined)
      
      @scala.inline
      def setTimingVar(value: String): Self = StObject.set(x, "timingVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingVarUndefined: Self = StObject.set(x, "timingVar", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setUseBeacon(value: Boolean): Self = StObject.set(x, "useBeacon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBeaconUndefined: Self = StObject.set(x, "useBeacon", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      @scala.inline
      def setViewportSize(value: String): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    }
  }
  
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.event
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.item
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.social
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception
    - typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing
  */
  trait HitType extends StObject
  object HitType {
    
    @scala.inline
    def event: typingsSlinky.googleAnalytics.googleAnalyticsStrings.event = "event".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.event]
    
    @scala.inline
    def exception: typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception = "exception".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.exception]
    
    @scala.inline
    def item: typingsSlinky.googleAnalytics.googleAnalyticsStrings.item = "item".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.item]
    
    @scala.inline
    def pageview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview = "pageview".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.pageview]
    
    @scala.inline
    def screenview: typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview = "screenview".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.screenview]
    
    @scala.inline
    def social: typingsSlinky.googleAnalytics.googleAnalyticsStrings.social = "social".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.social]
    
    @scala.inline
    def timing: typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing = "timing".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.timing]
    
    @scala.inline
    def transaction: typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction = "transaction".asInstanceOf[typingsSlinky.googleAnalytics.googleAnalyticsStrings.transaction]
  }
  
  @js.native
  trait Model extends StObject {
    
    def get(fieldName: String): js.Any = js.native
    
    def set(fieldName: String, fieldValue: js.Any): Unit = js.native
    def set(fieldName: String, fieldValue: js.Any, temporary: Boolean): Unit = js.native
    def set(fields: js.Object): Unit = js.native
    def set(fields: js.Object, fieldValue: js.UndefOr[scala.Nothing], temporary: Boolean): Unit = js.native
    def set(fields: js.Object, fieldValue: Null, temporary: Boolean): Unit = js.native
  }
  
  @js.native
  trait Tracker extends StObject {
    
    def get(fieldName: String): js.Any = js.native
    
    def send(hitType: String, fieldsObject: js.Object): Unit = js.native
    def send(hitType: String, fields: js.Any*): Unit = js.native
    
    def set(fieldName: String, fieldValue: js.Any): Unit = js.native
    def set(fieldsObject: js.Object): Unit = js.native
  }
  
  @js.native
  trait ga extends StObject {
    
    def apply(command: String, fields: js.Any*): Unit = js.native
    def apply(command: String, hitType: HitType, fields: js.Any*): Unit = js.native
    def apply(command: create, trackingId: String): Unit = js.native
    def apply(
      command: create,
      trackingId: String,
      cookieDomain: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: js.UndefOr[scala.Nothing], name: String): Unit = js.native
    def apply(
      command: create,
      trackingId: String,
      cookieDomain: js.UndefOr[scala.Nothing],
      name: String,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: String): Unit = js.native
    def apply(
      command: create,
      trackingId: String,
      cookieDomain: String,
      name: js.UndefOr[scala.Nothing],
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: String, name: String): Unit = js.native
    def apply(
      command: create,
      trackingId: String,
      cookieDomain: String,
      name: String,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: provide,
      pluginName: String,
      pluginConstructor: js.Function2[
          /* tracker */ typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker, 
          /* pluginOptions */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def apply(command: remove): Unit = js.native
    def apply(command: require, pluginName: String): Unit = js.native
    def apply(command: require, pluginName: String, pluginOptions: js.Any): Unit = js.native
    def apply(command: send, fieldsObject: FieldsObject): Unit = js.native
    def apply(command: send, fieldsObject: EventCategory): Unit = js.native
    def apply(command: send, hitType: event, eventCategory: String, eventAction: String): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: js.UndefOr[scala.Nothing],
      eventValue: js.UndefOr[scala.Nothing],
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: js.UndefOr[scala.Nothing],
      eventValue: Double
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: js.UndefOr[scala.Nothing],
      eventValue: Double,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: send, hitType: event, eventCategory: String, eventAction: String, eventLabel: String): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: js.UndefOr[scala.Nothing],
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: Double
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: Double,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: send, hitType: event, fieldsObject: EventAction): Unit = js.native
    def apply(command: send, hitType: pageview, page: String): Unit = js.native
    def apply(command: send, hitType: social, fieldsObject: SocialAction): Unit = js.native
    def apply(command: send, hitType: social, socialNetwork: String, socialAction: String, socialTarget: String): Unit = js.native
    def apply(command: send, hitType: timing, fieldsObject: TimingCategory): Unit = js.native
    def apply(command: send, hitType: timing, timingCategory: String, timingVar: String, timingValue: Double): Unit = js.native
    def apply(
      readyCallback: js.Function1[
          /* defaultTracker */ js.UndefOr[typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker], 
          Unit
        ]
    ): Unit = js.native
    
    def create(trackingId: String): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, fieldsObject: FieldsObject): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, name: String): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, name: String, fieldsObject: FieldsObject): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, fieldsObject: FieldsObject): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    
    def getAll(): js.Array[typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker] = js.native
    
    def getByName(name: String): typingsSlinky.googleAnalytics.UniversalAnalytics.Tracker = js.native
    
    var l: Double = js.native
    
    var q: js.Array[_] = js.native
    
    def remove(name: String): Unit = js.native
  }
}
