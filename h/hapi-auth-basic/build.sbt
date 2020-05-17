organization := "org.scalablytyped.slinky"
name := "hapi-auth-basic"
version := "5.0.0-dt-20200225Z-a84917"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-9bc6cb",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-6df910",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200427Z-dbd1c9",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-2b9b4c",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-04761c",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-b0f594",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200330Z-c9e8fe",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-1e929f",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-02c7ec",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
