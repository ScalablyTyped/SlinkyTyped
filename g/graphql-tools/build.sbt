organization := "org.scalablytyped.slinky"
name := "graphql-tools"
version := "6.0.15-c85e8e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-e66111",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-267e63",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e8c905",
  "org.scalablytyped.slinky" %%% "dataloader" % "2.0.0-a5edb6",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-48ef1f",
  "org.scalablytyped.slinky" %%% "globby" % "11.0.1-378e3a",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-079e56",
  "org.scalablytyped.slinky" %%% "graphql-tools__batch-delegate" % "6.0.15-ca66b1",
  "org.scalablytyped.slinky" %%% "graphql-tools__code-file-loader" % "6.0.15-9e01fb",
  "org.scalablytyped.slinky" %%% "graphql-tools__delegate" % "6.0.15-ef0d56",
  "org.scalablytyped.slinky" %%% "graphql-tools__git-loader" % "6.0.15-074af5",
  "org.scalablytyped.slinky" %%% "graphql-tools__github-loader" % "6.0.15-4503f0",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-file-loader" % "6.0.15-c59a56",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-7f4150",
  "org.scalablytyped.slinky" %%% "graphql-tools__import" % "6.0.15-2ae5de",
  "org.scalablytyped.slinky" %%% "graphql-tools__links" % "6.0.15-998909",
  "org.scalablytyped.slinky" %%% "graphql-tools__load" % "6.0.15-15cebe",
  "org.scalablytyped.slinky" %%% "graphql-tools__load-files" % "6.0.15-ab072d",
  "org.scalablytyped.slinky" %%% "graphql-tools__merge" % "6.0.15-a2af73",
  "org.scalablytyped.slinky" %%% "graphql-tools__mock" % "6.0.15-b634d3",
  "org.scalablytyped.slinky" %%% "graphql-tools__module-loader" % "6.0.15-e20973",
  "org.scalablytyped.slinky" %%% "graphql-tools__relay-operation-optimizer" % "6.0.15-c31172",
  "org.scalablytyped.slinky" %%% "graphql-tools__resolvers-composition" % "6.0.15-651a15",
  "org.scalablytyped.slinky" %%% "graphql-tools__schema" % "6.0.15-44f697",
  "org.scalablytyped.slinky" %%% "graphql-tools__stitch" % "6.0.15-aa0e67",
  "org.scalablytyped.slinky" %%% "graphql-tools__url-loader" % "6.0.15-8cfdd8",
  "org.scalablytyped.slinky" %%% "graphql-tools__utils" % "6.0.15-531dfc",
  "org.scalablytyped.slinky" %%% "graphql-tools__wrap" % "6.0.15-0212ab",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-bcbf4b",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-a7874d",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-08b3da",
  "org.scalablytyped.slinky" %%% "p-limit" % "3.0.2-77d7f5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "websocket" % "1.0-dt-20200707Z-8437c0",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-82acd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
