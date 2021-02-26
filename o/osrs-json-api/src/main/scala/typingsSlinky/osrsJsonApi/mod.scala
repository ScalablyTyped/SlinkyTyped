package typingsSlinky.osrsJsonApi

import typingsSlinky.osrsJsonApi.anon.AbyssalSire
import typingsSlinky.osrsJsonApi.anon.Agility
import typingsSlinky.osrsJsonApi.anon.All
import typingsSlinky.osrsJsonApi.anon.Current
import typingsSlinky.osrsJsonApi.anon.Hunter
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ge {
    
    @JSImport("osrs-json-api", "ge.getGraph")
    @js.native
    def getGraph(id: Double): js.Promise[Graph] = js.native
    
    @JSImport("osrs-json-api", "ge.getItem")
    @js.native
    def getItem(id: Double): js.Promise[Item] = js.native
    
    @js.native
    trait Graph extends StObject {
      
      var average: TimestampPriceRecord = js.native
      
      var daily: TimestampPriceRecord = js.native
    }
    object Graph {
      
      @scala.inline
      def apply(average: TimestampPriceRecord, daily: TimestampPriceRecord): Graph = {
        val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], daily = daily.asInstanceOf[js.Any])
        __obj.asInstanceOf[Graph]
      }
      
      @scala.inline
      implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAverage(value: TimestampPriceRecord): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDaily(value: TimestampPriceRecord): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Item extends StObject {
      
      var item: Current = js.native
    }
    object Item {
      
      @scala.inline
      def apply(item: Current): Item = {
        val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[Item]
      }
      
      @scala.inline
      implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItem(value: Current): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      }
    }
    
    type TimestampPriceRecord = Record[String, Double]
    
    @js.native
    trait TrendPriceObject extends StObject {
      
      var price: Double = js.native
      
      var trend: String = js.native
    }
    object TrendPriceObject {
      
      @scala.inline
      def apply(price: Double, trend: String): TrendPriceObject = {
        val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], trend = trend.asInstanceOf[js.Any])
        __obj.asInstanceOf[TrendPriceObject]
      }
      
      @scala.inline
      implicit class TrendPriceObjectMutableBuilder[Self <: TrendPriceObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrend(value: String): Self = StObject.set(x, "trend", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object hiscores {
    
    @JSImport("osrs-json-api", "hiscores.getPlayer")
    @js.native
    def getPlayer(rsn: String): js.Promise[Player] = js.native
    @JSImport("osrs-json-api", "hiscores.getPlayer")
    @js.native
    def getPlayer(rsn: String, gamemode: Gamemodes): js.Promise[Player] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.main
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.iron
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.uim
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.hcim
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmm
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.sdmm
      - typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmmt
    */
    trait Gamemodes extends StObject
    object Gamemodes {
      
      @scala.inline
      def dmm: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmm = "dmm".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmm]
      
      @scala.inline
      def dmmt: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmmt = "dmmt".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.dmmt]
      
      @scala.inline
      def hcim: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.hcim = "hcim".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.hcim]
      
      @scala.inline
      def iron: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.iron = "iron".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.iron]
      
      @scala.inline
      def main: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.main = "main".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.main]
      
      @scala.inline
      def sdmm: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.sdmm = "sdmm".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.sdmm]
      
      @scala.inline
      def uim: typingsSlinky.osrsJsonApi.osrsJsonApiStrings.uim = "uim".asInstanceOf[typingsSlinky.osrsJsonApi.osrsJsonApiStrings.uim]
    }
    
    @js.native
    trait Player extends StObject {
      
      var bh: Hunter = js.native
      
      var bosses: AbyssalSire = js.native
      
      var clues: All = js.native
      
      var lms: RankScoreObject = js.native
      
      var skills: Agility = js.native
    }
    object Player {
      
      @scala.inline
      def apply(bh: Hunter, bosses: AbyssalSire, clues: All, lms: RankScoreObject, skills: Agility): Player = {
        val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
        __obj.asInstanceOf[Player]
      }
      
      @scala.inline
      implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBh(value: Hunter): Self = StObject.set(x, "bh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBosses(value: AbyssalSire): Self = StObject.set(x, "bosses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClues(value: All): Self = StObject.set(x, "clues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLms(value: RankScoreObject): Self = StObject.set(x, "lms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkills(value: Agility): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RankLevelXpObject extends StObject {
      
      var level: Double = js.native
      
      var rank: String = js.native
      
      var xp: Double = js.native
    }
    object RankLevelXpObject {
      
      @scala.inline
      def apply(level: Double, rank: String, xp: Double): RankLevelXpObject = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
        __obj.asInstanceOf[RankLevelXpObject]
      }
      
      @scala.inline
      implicit class RankLevelXpObjectMutableBuilder[Self <: RankLevelXpObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RankScoreObject extends StObject {
      
      var rank: Double = js.native
      
      var score: Double = js.native
    }
    object RankScoreObject {
      
      @scala.inline
      def apply(rank: Double, score: Double): RankScoreObject = {
        val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
        __obj.asInstanceOf[RankScoreObject]
      }
      
      @scala.inline
      implicit class RankScoreObjectMutableBuilder[Self <: RankScoreObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      }
    }
  }
}
