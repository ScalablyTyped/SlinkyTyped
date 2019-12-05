organization := "org.scalablytyped.slinky"
name := "glue"
version := "5.0-dt-20181023Z-e9449f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20190805Z-112e20",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-865fe7",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20191115Z-6a457d",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-94b91c",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20191101Z-bdcee5",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-7b6e37",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20190322Z-fae497",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20190322Z-c87bd3",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-afb9f2",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        