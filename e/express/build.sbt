organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20200706Z-670233"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-db72a0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-8b46ec",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-28b253",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-699d00",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-051843",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-ad8cdd",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-c86e67",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-56a083",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
